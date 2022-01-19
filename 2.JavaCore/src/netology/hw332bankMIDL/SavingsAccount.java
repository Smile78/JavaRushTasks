package netology.hw332bankMIDL;

// Сберегательный счет
// Со сберегательного счета нельзя платить, только переводить и пополнять.
// не может уходить в минус.

public class SavingsAccount extends Account {

    private int balance;

    SavingsAccount(String nameFIO) {
        super(nameFIO, "\"Сберегательный\"");
        balance = 0;
    }

    @Override
    void pay(int amount) {
        System.out.println("\n***\nТип счета " + this.type + " операция \"Оплата\" не поддерживается\n***\n");
    }

    @Override
    void transfer(Account account, int amount) {
        if (amount > this.balance) {
            System.out.println("Тип операции Трансфер");
            System.out.println("...Недостаточно средств для операции списания суммы в размере " + amount + " руб. \n");
        } else {
            transferGo(account, amount );
        }
    }

    @Override
    boolean addMoney(int amount) {
        print1(amount,"ПОПОЛНЕНИЕ");
        balance += amount;
        print2();
        return true;

    }

    @Override
    public  int getBalance(){
        return this.balance;
    }

    @Override
    public void minusBalance(int amount){
        this.balance-=amount;
    }


}
