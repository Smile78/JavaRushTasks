package netology.hw332bankMIDL;

//Кредитный счет
//Кредитный не может иметь положительный баланс
//если платить с него, то уходит в минус, чтобы вернуть в 0, надо пополнить его

public class CreditAccount extends Account {

    private int balance;

    CreditAccount(String nameFIO) {
        super(nameFIO, "\"Кредитный\"");
        balance = 0;
    }

    @Override
    public int getBalance() {
        return balance;
    }

    @Override
    public void minusBalance(int amount) {
        this.balance -= amount;
    }

    @Override
    void pay(int amount) {
        print1(amount, "ОПЛАТА");
        this.balance -= amount;
        print2();
    }

    @Override
    void transfer(Account account, int amount) {
        if (account.type.equals("\"Кредитный\"") & (account.getBalance() + amount) >= 0) {
            System.out.println("***\nВ двух словах-  трансфера не будет- счет назначения будет переполнен\n***");
        } else {
            transferGo(account, amount);
        }
    }

    @Override
    public boolean addMoney(int amount) {
        //не может иметь положительный баланс
        if ((this.balance + amount) >= 0) {
            System.out.println("Тип счета " + this.type + "\nОперация ПОПОЛНЕНИЕ\n...превышена сумма пополнения счета... Ваша задолжность: " +
                    this.balance + " руб. При этом сумма пополнения: " + amount + " руб.\n");
            return false;
        } else {
            print1(amount, "ПОПОЛНЕНИЕ");
            this.balance += amount;
            print2();
            return true;
        }
    }

}

