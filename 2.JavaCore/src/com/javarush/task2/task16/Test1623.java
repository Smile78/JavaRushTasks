package com.javarush.task2.task16;

public class Test1623 {

    static int count = 15;
    static volatile int createdThreadCount;

    public static void main(String[] args) {

            System.out.println(new GenerateThread());

    }

    public static class GenerateThread extends Thread {
        GenerateThread(){
            super(String.valueOf(++createdThreadCount));
            this.start();
        }

        @Override
        public void run() {
           if (createdThreadCount<=count) {
               System.out.println(new GenerateThread());

            }
        }

        @Override
        public String toString() {
            return getName()+" created";
        }
    }


}
