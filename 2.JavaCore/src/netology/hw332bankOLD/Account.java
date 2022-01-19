package netology.hw332bankOLD;

public abstract class Account {

    private int balance;
    String type;
    String nameFIO;

    Account(String nameFIO, String type) {
        this.nameFIO = nameFIO;
        this.type = type;
    }

    abstract void pay(int amount);

    abstract void transfer(Account account, int amount);

    abstract void addMoney(int amount);

    abstract int getBalance() ;

    abstract void minusBalance(int amount);

    public void transferGo(Account account, int amount) {
        print1(amount, "ТРАНСФЕР");
        System.out.println("Операция ТРАНСФЕР ну сумму: " + amount + " руб. " + "в адрес счета " + account.nameFIO);
        minusBalance(amount);
        account.addMoney(amount);
        print2();
        System.out.println("Тип счета " + account.type + " Владелец: " + account.nameFIO + " текущий баланс: " + account.getBalance() + " руб. ");
    }

    public Boolean transferElit(Account account, int amount) {
         return true;// как минимум требует доработки
    }


    public void print1(int amountPrint, String oper) {
        System.out.println("Тип счета " + this.type + " Владелец: " + this.nameFIO + " текущий баланс: " + this.getBalance());
        System.out.println("операция "+oper+" . счет "+ this.nameFIO + ".  сумма операции в размере: " + amountPrint + " руб. ");
    }

    public void print2() {
//        System.out.println("Баланс счета " + this.nameFIO + " составляет: " + this.getBalance()  + " руб. ");
        System.out.println("Тип счета " + this.type + " Владелец: " + this.nameFIO + " текущий баланс: " + this.getBalance()+ " руб. ");
    }

    public void print2(Account account) {
//        System.out.println("Баланс счета " + this.nameFIO + " составляет: " + this.getBalance()  + " руб. ");
        System.out.println("Тип счета " + account.type + " Владелец: " + account.nameFIO + " текущий баланс: " + account.getBalance()+ " руб. ");
    }

    public void print3elit() {
        System.out.println("=".repeat(30));


    }





}
