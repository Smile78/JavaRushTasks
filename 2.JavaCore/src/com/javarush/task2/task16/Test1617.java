package com.javarush.task2.task16;

import java.sql.SQLOutput;

public class Test1617 {

//    public static volatile int numSeconds = 4;
    public static volatile int numSeconds = 3;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        //add your code here - добавь код тут
        Thread.sleep(3500);
        clock.interrupt();

    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            //add your code here - добавь код тут

            try {
                while(numSeconds!=0){
                        System.out.print(numSeconds+" ");
                        Thread.sleep(1000);

                        numSeconds--;

                }System.out.print("Марш"+" ");

            } catch (InterruptedException e) {
                System.out.println("Прервано!");
                e.printStackTrace();

            }

        }
    }
}
