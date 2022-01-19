package com.javarush.task.task16.task1633;

public class Solution {

    public static Thread.UncaughtExceptionHandler handler = new OurUncaughtExceptionHandler();      //50%

      public static void main(String[] args) {
//          System.out.println(Thread.currentThread().getName());
//        TestedThread commonThread = new TestedThread();
        TestedThread commonThread = new TestedThread(handler);
//          commonThread.start();
//          commonThread.interrupt();

          Thread threadA = new Thread(commonThread, "Нить 1");     //ok
          Thread threadB = new Thread(commonThread, "Нить 2");     //ok

//          Thread.setDefaultUncaughtExceptionHandler(handler); ;// -Вариант 1


//          threadA.setUncaughtExceptionHandler(handler); // Вариант 2
//          threadB.setUncaughtExceptionHandler(handler);

        threadA.start();                                        //ok
        threadB.start();                                        //ok

        threadA.interrupt();                                        //ok
        threadB.interrupt();                                        //ok
    }    //100%


    public static class TestedThread extends Thread {
//        public TestedThread() {
//             start();                            // ------------------ кпзцд
//        }
        public TestedThread(Thread.UncaughtExceptionHandler handler) {
//            setUncaughtExceptionHandler(handler);
                start();
//            currentThread().setUncaughtExceptionHandler(handler); // - у тестед а не Треад??
        } //  автостарт и  запуск метода поимки\обрб ошибки из интерфейса --- но КАААК?

        public void run() {
            //ok
//            currentThread().setUncaughtExceptionHandler(handler);// -вариант3
            try {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException("My exception message");

            }
        } //ok-слип выдает ошибку изза интерапта из мейна
    }


    public static class OurUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
        @Override
        public void uncaughtException(Thread t, Throwable e) {
            System.out.println(t.getName() + ": " + e.getMessage());
        }
    } // зачем вообще его оверрайдить - тоже самое же -потомучто там ИНТЕРФЕЙС
}
