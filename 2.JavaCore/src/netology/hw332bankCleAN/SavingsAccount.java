package netology.hw332bankCleAN;

// Сберегательный счет
// Со сберегательного счета нельзя платить, только переводить и пополнять.
// не может уходить в минус.



public class SavingsAccount extends Account{

    private int balance;

    SavingsAccount(String nameFIO) {
        super(nameFIO, "\"Сберегательный\"");
        balance = 0;
    }


    @Override
    boolean pay(int amount) {
        print1(1,amount,"PAY",this.balance);
        System.out.println("ОПЕРАЦИЯ НЕ ПОДДЕРЖИВАЕТСЯ");
        return false;

    }

    @Override
    boolean transfer(Account account, int amount) {
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
            System.out.println("НЕДОСТАТОЧНО СРЕДСТВ ДЛЯ ПЕРЕВОДА но этоже Сберегательный такчто ОП");
            account.balance += amount;
            this.balance -= amount;

            System.out.println("Успешно!");
            System.out.println("состояние счета отправки после операции: " + this.balance);
            System.out.println("состояние счета получения после операции: " + account.balance);

            return true;
        } else {
            System.out.println("Нельзя положить отрицательное!");
            return false;
        }
    }

    @Override
    boolean addMoney(int amount) {
        print1(1,amount,"ADDMONEY",this.balance);

        if (amount >= 0) {
            this.balance+=amount;
            System.out.println("Успешно!");
            System.out.println("состояние счета после операции: " + this.balance);
            return true;
        } else System.out.println("Нельзя положить отрицательное!");
        return false;
    }
}
