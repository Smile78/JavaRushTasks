package netology.hw332bankCleAN;

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
    boolean pay(int amount) {
        print1(1, amount, "PAY", this.balance);

        if (amount < 0) {
            System.out.println("Нельзя снять уже отрицательное");
            return false;
        } else {
            this.balance -= amount;
            System.out.println("Успешно!");
            System.out.println("состояние счета после операции: " + this.balance);
            return true;
        }

    }


    @Override
    boolean transfer(Account account, int amount) {

        print1(1, amount, "TRANSFER", this.balance);
        System.out.println("адрес перевода: " + account.nameFIO);

        if (amount < 0) {
            System.out.println("Нельзя перевести  отрицательное");
            return false;

        } else if (account.addMoney(amount)) {

//            this.balance -= amount;
//            account.balance += amount;

//            System.out.println("Успешно!");
//            System.out.println("состояние счета отправки после операции: " + this.balance);
//            System.out.println("состояние счета получения после операции: " + account.balance);

            return true;

        } else {
            System.out.println("Перевести не получится");
            return false;
        }

    }


    @Override
    boolean addMoney(int amount) {
        //не может иметь положительный баланс

        print1(1, amount, "ADDMONEY", this.balance);
        if (amount <= 0) {
            System.out.println("Нельзя положить отрицательное!");
            return false;
        } else if ((this.balance + amount) > 0) {
            System.out.println("Нельзя положить сумму превышающую задолженность!");
            return false;
        } else {
            this.balance += amount;
            System.out.println("Успешно!");
            System.out.println("состояние счета после операции: " + this.balance);
            return true;
        }

    }


}

