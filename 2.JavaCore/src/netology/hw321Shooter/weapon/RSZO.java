package netology.hw321Shooter.weapon;

import java.util.concurrent.Phaser;

public class RSZO extends Weapon   {


    void sleep(double time){
        int timeIn= (int)(time*1000);
        try {
            Thread.sleep(timeIn);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void shot() {
        // TODO override me!

//        sleep(1);
        for (int i = 3; i >= 0; i--) {
            sleep(1);
            if(i==0) System.out.println("Обратный отсчет:"+i+" ПУСК!");
            else System.out.println("Обратный отсчет:"+i);
        }

        System.out.println("\nВнимание! Работает спутниковая система залпового огня \"Золотой глаз\"\n");
//        System.out.println("Синхронизация");
        sleep(3);

        Phaser phpZ = new Phaser(1);

        for (int i = 0; i < 2; i++) {
            new Thread(new RSZOShut(phpZ,"Изделие "+i)).start();
        }

        // ждем завершения фазы 0
        int phase = phpZ.getPhase();
        phpZ.arriveAndAwaitAdvance();
        System.out.println("Контрольный Центр: Отчет(мб не во время)...Все изделия завершили Фазу" + (phase+1));

        // ждем завершения фазы 1
        phase = phpZ.getPhase();
        phpZ.arriveAndAwaitAdvance();
        System.out.println("Контрольный Центр: Отчет(мб не во время)...Все изделия завершили Фазу" + (phase+1));

        // ждем завершения фазы 2
        phase = phpZ.getPhase();
        phpZ.arriveAndAwaitAdvance();
        System.out.println("Контрольный Центр: Отчет(мб не во время)...Все изделия завершили Фазу" + (phase+1));

        phpZ.arriveAndDeregister();

    }
}
