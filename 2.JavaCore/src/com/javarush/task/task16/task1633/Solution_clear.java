package com.javarush.task.task16.task1633;

public class Solution_clear {


    public static Thread.UncaughtExceptionHandler myHandler = new OurUncaughtExceptionHandler();
    public static Thread.UncaughtExceptionHandler myHandler2 = new OurUncaughtExceptionHandler2();

    public static void main(String[] args) throws InterruptedException {

        TestThread commonThread = new TestThread(myHandler);

        Thread threadA = new Thread(commonThread, "Нить А");
        Thread threadB = new Thread(commonThread, "Нить В");

        threadA.setUncaughtExceptionHandler(myHandler);
        threadB.setUncaughtExceptionHandler(myHandler2);

        threadA.start();
        threadA.interrupt();

        threadB.start();
        threadB.interrupt();
    }

    public static class TestThread extends Thread {

        public TestThread(Thread.UncaughtExceptionHandler handler) {
            setUncaughtExceptionHandler(handler);
            start();
        }


        public void run() {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException("My exception message");
            }
        }
    }


    public static class OurUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {

        @Override
        public void uncaughtException(Thread t, Throwable e) {
            System.out.println(t.getName() + ": " + e.getMessage());
        }
    }

    public static class OurUncaughtExceptionHandler2 implements Thread.UncaughtExceptionHandler {
        @Override
        public void uncaughtException(Thread t, Throwable e) {
            System.out.println("Отработал второй свод правил обработки неконтролируемых исключений");
        }
    }

}
