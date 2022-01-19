package netology.hw332bankMIDL;

// Расчетный счет
// Расчетный может выполнять все три операции, но не может уходить в минус

public class CheckingAccount extends Account {

    private int balance;

    CheckingAccount(String nameFIO) {
        super(nameFIO, "\"Расчетный\"");
        balance = 0;
    }

    @Override
    void pay(int amount) {
        // не может уходить в минус
        if ((this.balance - amount) <= 0) {
            System.out.println("\n***\nВ двух словах-  оплаты  не будет!!  ");
            System.out.println("поскольку суммы " + amount + " руб. нет на счету");
            print2();
            System.out.println("***");
        } else {
            print1(amount, "ОПЛАТА");
            this.balance -= amount;
            print2();
        }
    }

    @Override
    void transfer(Account account, int amount) {
        //не может уходить в минус

        if ((this.balance - amount) <= 0) {
            System.out.println("\n***\nВ двух словах-  оплаты  не будет!!  ");
            System.out.println("поскольку суммы " + amount + " руб. нет на счету");
            print2();
            System.out.println("***");

        }  else {
            transferGo(account, amount );
        }
    }

    @Override
    public boolean addMoney(int amount) {
        print1(amount, "ПОПОЛНЕНИЕ");
        this.balance += amount;
        print2();
        return true;

    }

    @Override
    public int getBalance() {
        return this.balance;
    }

    @Override
    public void minusBalance(int amount){
        this.balance-=amount;
    }

}

