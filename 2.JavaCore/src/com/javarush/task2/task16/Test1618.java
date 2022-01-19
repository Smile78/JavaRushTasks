package com.javarush.task2.task16;

public class Test1618 {

    public static void main(String[] args) throws InterruptedException {
        //Add your code here - добавь код тут
        TestThread tst = new TestThread();
        tst.start();
        Thread.sleep(3000);
        tst.interrupt();
    }

    //Add your code below - добавь код ниже
    public static class TestThread extends Thread{

        int x= 0;

        public void run() {
             while (x==0){
                 x--;
                 try {
                     Thread.sleep(1000);
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
             }
        }
    }
}
