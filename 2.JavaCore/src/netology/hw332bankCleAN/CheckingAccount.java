package netology.hw332bankCleAN;

// Расчетный счет
// Расчетный может выполнять все три операции, но не может уходить в минус


public class CheckingAccount extends Account {

    public int balance;

    CheckingAccount(String nameFIO) {
        super(nameFIO, "\"Расчетный\"");
        balance = 0;
    }

    @Override
    boolean pay(int amount) {
        print1(1, amount, "PAY", this.balance);

        if (amount < 0) {
            System.out.println("Нельзя снять уже отрицательное");
            return false;
        } else if ((this.balance -= amount) >= 0) {
            System.out.println("Успешно!");
            System.out.println("состояние счета после операции: " + this.balance);
            return true;
        } else {
            System.out.println("Не достаточно средств");
            return false;
        }
    }


    @Override
    boolean transfer(Account account, int amount) {
        //не может уходить в минус
        print1(1, amount, "TRANSFER", this.balance);
        System.out.println("адрес перевода: " + account.nameFIO);

        if (amount >= 0 && this.balance >= amount) {
            account.balance += amount;
            this.balance -= amount;

            System.out.println("Успешно!");
            System.out.println("состояние счета отправки после операции: " + this.balance);
            System.out.println("состояние счета получения после операции: " + account.balance);
            return true;
        } else if (this.balance <= amount) {
            System.out.println("НЕДОСТАТОЧНО СРЕДСТВ ДЛЯ ПЕРЕВОДА");
            return false;
        } else {
            System.out.println("Нельзя положить отрицательное!");
            return false;
        }
    }


    @Override
    public boolean addMoney(int amount) {
        print1(1, amount, "ADDMONEY", this.balance);

        if (amount >= 0) {
            this.balance += amount;
            System.out.println("Успешно!");
            System.out.println("состояние счета после операции: " + this.balance);
            return true;
        } else System.out.println("Нельзя положить отрицательное!");
        return false;
    }
}

