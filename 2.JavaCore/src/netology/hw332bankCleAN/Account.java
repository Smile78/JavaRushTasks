package netology.hw332bankCleAN;

public abstract class Account {

    int balance;
    String type;
    String nameFIO;

    Account(String nameFIO, String type) {
        this.nameFIO = nameFIO;
        this.type = type;
    }

    abstract boolean pay(int amount);

    abstract boolean transfer(Account account, int amount);

    abstract boolean addMoney(int amount);




    void print1(int sw, int amount,String oper, int balance) {

        switch(sw) {
            case (1):
                System.out.println("");
                System.out.println("Владелец счета: " + this.nameFIO);
                System.out.println("счет " + this.type);
                System.out.println("состояние счета до операции: " +  balance);
                System.out.println("Операция "+oper+" ");
                System.out.println("сумма операции: " + amount);
                break;

            default:
                System.out.println("default");
                break;
        }

    }


}
