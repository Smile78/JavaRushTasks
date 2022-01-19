package netology.hw332bankMIDL;

// Включение в классы всех счетов
// внутренней логики о том как работает кредитный-  плохо,
// тк получается что
// информацию о каждой особенности поведения какого-либо счёта
// придётся дублировать по всем классам-счетам,
// что было бы невыносимо - поддерживать как кодовую базу в рабочем состоянии.

// Лучше применить принципы ООП,
// пусть кредитный счёт сам держит у себя в голове свою логику
// и отвечает другим счетам своим поведением:
// для этого пусть каждый метод операций возвращает boolean о том упешно ли она прошла,
// а тот же метод transfer реализовывал бы взаимодействие с целевым счётом через них.


//короч
//
//убрать из всех действия по кредитному- пусть сам все делает
//доавить булин в методы
//и трансфер чрз эти методы действовалбы


public class Main {

    // банковская программа работает с общими для счетов операциями как с одинаковыми объектами,
    // и выполняет их, обращаясь к общему типу "Счет"

    // Выполните перевод с одного счета на другой в методе public static void main.

    // Каждый из них должен хранить баланс.

    // Создайте три переменные типа Account и присвойте им три разных типа счетов.

    public static void main(String[] args) {

        System.out.println("******** Сберегательный *********\n");
        Account svAcc1 = new SavingsAccount("FIO1sber");
        svAcc1.addMoney(222_000);
//        Account svAcc2 = new SavingsAccount("FIO2sber");
//        svAcc2.addMoney(111_000);
////
//        svAcc1.pay(222);
//        svAcc2.transfer(svAcc1,333);

        System.out.println("\n******** Кредитный *********\n");
        Account crAcc1 = new CreditAccount("FIO3crd");
        crAcc1.pay(333);
//        crAcc1.addMoney(111);
//        crAcc1.addMoney(777);
//
//        Account crAcc2 = new CreditAccount("FIO4crd");
//        crAcc2.pay(555);
//
//        crAcc1.transfer(crAcc2,111);
//        crAcc1.transfer(crAcc2,999);

        System.out.println("\n******** Расчетный *********\n");
        Account chckAcc1 = new CheckingAccount("FIO5chkn");
        chckAcc1.addMoney(123_000);
//
//        chckAcc1.pay(2_999);
//        chckAcc1.pay(120_002);
//
//        Account chckAcc2 = new CheckingAccount("FIO6chkn");
//        chckAcc1.transfer(chckAcc2, 2000);

        System.out.println("\n******** Микс Файт *********\n");

//        svAcc1.transfer(crAcc1 ,332);         // cо Сберегательного на Кредитный  OK
//        svAcc1.transfer(crAcc1 , 335);        // cо Сберегательного на Кредитный тумач тут  OKK
//        svAcc1.transfer(chckAcc1 ,333);       // cо Сберегательного на Расчетный  OK
//        svAcc1.transfer(chckAcc1 ,223_000);   // cо Сберегательного на Расчетный  тумач тут OK

//        crAcc1.transfer(svAcc1 ,111);         // c Кредитного на Сберегательный   OK
//        crAcc1.transfer(chckAcc1 ,111);       // c Кредитного на Расчетный    OK

//        chckAcc1.transfer(svAcc1 ,333);       // c  Расчетного на Сберегательный OK
//        chckAcc1.transfer(svAcc1 ,124_000);   // c  Расчетного на Сберегательный тумач тут OK
//        chckAcc1.transfer(crAcc1 ,111);       // c  Расчетного на Кредитный   OK
//        chckAcc1.transfer(crAcc1 ,334);       // c  Расчетного на Кредитный тумач тут OKK

    }
}
