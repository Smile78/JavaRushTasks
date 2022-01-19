package netology.hw321Shooter.weapon;

import java.util.concurrent.Phaser;


public class RSZOShut implements Runnable {
    Phaser phaser;
    String indGRAUname;


    RSZOShut(Phaser phaser, String indGRAUname) {
        this.phaser = phaser;
        this.indGRAUname = indGRAUname;
        phaser.register();
    }

    void sleep(double time) {
        int timeIn = (int) (time * 1000);
        try {
            Thread.sleep(timeIn);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {

//        System.out.println(indGRAUname +" Фаза"+ (phaser.getPhase()+1) +" : Старт");// 1ая ФАЗА СТАРТ
        for (int i = 0; i < 2; i++) {
//            sleep(0.2);
            System.out.println(indGRAUname + ": Фаза1 " + ": Накопитель " + i + " подключен");
        }
        phaser.arriveAndAwaitAdvance(); // сообщаем, что первая фаза достигнута


//        Thread.sleep(0.2);
//        System.out.println(indGRAUname +" Фаза"+ (phaser.getPhase()+1) +" : старт");// 2ая ФАЗА СТАРТ
        for (int i = 0; i < 2; i++) {
//            sleep( 0.2);
            System.out.println(indGRAUname + ": Фаза2 " + ": Поле " + i + " активировано");
        }
        phaser.arriveAndAwaitAdvance(); // сообщаем, что ВТОРАЯ  фаза достигнута


//        System.out.println(indGRAUname +" Фаза"+ (phaser.getPhase()+1) +" : старт"); // 3ья ФАЗА СТАРТ
//        Thread.sleep(0.200);
        System.out.println(indGRAUname + ": Атака");
        phaser.arriveAndAwaitAdvance(); // сообщаем, что Третья  фаза достигнута

        System.out.println(indGRAUname + ": Отчет(мб не во время)...Отработано штатно");
        System.out.println(indGRAUname + ": Отчет(мб не во время)...Режим ожидания");
    }
}
