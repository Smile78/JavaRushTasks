package com.javarush.task.task16.task1626;

public class Solution {
    public static int number = 5;
//    static Thread t1 = new Thread(new CountdownRunnable(), "Уменьшаем");
    public static void main(String[] args) {

//                t1.start();

//               try{ t1.join();}catch (InterruptedException e){
//                   System.out.println("xz");
//               }
        new Thread(new CountdownRunnable(), "Уменьшаем").start();
        new Thread(new CountUpRunnable(), "Увеличиваем").start();
    }

    public static class CountUpRunnable implements Runnable {
        private int countIndexUp = 1;

        public void run() {
            try {
                while (true) {
                    System.out.println(toString());
                    countIndexUp += 1;
                    Thread.sleep(500);
//                    if (countIndexUp == number) return;
                    if (countIndexUp == number+1) return;

                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countIndexUp;
        }
    }



    public static class CountdownRunnable implements Runnable {
        private int countIndexDown = Solution.number;

        public void run() {
            try {
                while (true) {
                    System.out.println(toString());
                    countIndexDown -= 1;
                    if (countIndexDown == 0) return;
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countIndexDown;
        }
    }
}
