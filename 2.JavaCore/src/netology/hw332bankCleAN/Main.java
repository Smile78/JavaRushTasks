package netology.hw332bankCleAN;

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


    public static void main(String[] args) {

        System.out.println("******** Сберегательный *********\n");
//        Account svAcc1 = new SavingsAccount("FIO_111_Сберег");
//        svAcc1.addMoney(222_000);
//        svAcc1.pay(222);

//        Account svAcc2 = new SavingsAccount("FIO_222_Сберег");
//        svAcc1.transfer(svAcc2,2);
//        svAcc1.transfer(svAcc2,-2);




        System.out.println("\n******** Расчетный *********\n");
//        Account chckAcc1 = new CheckingAccount("FIO_555_Расч");
//        chckAcc1.addMoney(123_000);
//        chckAcc1.pay(2_999);
//        chckAcc1.pay(-2_999);
//
//        Account chckAcc2 = new CheckingAccount("FIO_666_Расч");
//        chckAcc1.transfer(chckAcc2,2);
//        chckAcc1.transfer(chckAcc2,-2);
//        chckAcc1.transfer(chckAcc2,123);


        System.out.println("\n******** Кредитный *********\n");
        Account crAcc1 = new CreditAccount("FIO_333_Крдт");
//        crAcc1.pay(333);
//        crAcc1.pay(-333);     // нельзя отрицательное

//        crAcc1.addMoney(111);  //можно добв
//        crAcc1.addMoney(111);     //нельзя переброщить
//        crAcc1.addMoney(-111); // нельзя отрицательное

        Account crAcc2 = new CreditAccount("FIO_444_Крдт");
             crAcc2.pay(333);               //-ok
//             crAcc2.addMoney(111);           //-ok
//             crAcc1.transfer(crAcc2, -111);           //-ok

             crAcc1.transfer(crAcc2, 111);



        System.out.println("\n******** Микс Файт *********\n");


//        svAcc1.transfer(chckAcc1 ,333);       // cо Сберегательного на Расчетный  OK
//        svAcc1.transfer(chckAcc1 ,333);       // cо Сберегательного на Расчетный  тумач (но тут можно) OK
//        svAcc1.transfer(chckAcc1 ,-333);       // cо Сберегательного на Расчетный  тумач (но тут можно) OK

//        chckAcc1.transfer(svAcc1 ,333);       // c  Расчетного на Сберегательный OK
//        chckAcc1.transfer(svAcc1 ,333);       // c  Расчетного на Сберегательный тумач
//        chckAcc1.transfer(svAcc1 ,-333);       // c  Расчетного на Сберегательный неавокадо ОК


//  кредитный ОГОГО

//        svAcc1.transfer(crAcc1 ,332);         // cо Сберегательного на Кредитный
//        svAcc1.transfer(crAcc1 , 335);        // cо Сберегательного на Кредитный тумач

//        chckAcc1.transfer(crAcc1 ,111);       // c  Расчетного на Кредитный
//        chckAcc1.transfer(crAcc1 ,334);       // c  Расчетного на Кредитный тумач

//        crAcc1.transfer(svAcc1 ,111);         // c Кредитного на Сберегательный
//        crAcc1.transfer(chckAcc1 ,111);       // c Кредитного на Расчетный


    }
}
