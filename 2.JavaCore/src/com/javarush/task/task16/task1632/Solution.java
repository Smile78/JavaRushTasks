package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class
Solution {

    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new Thread1());
        threads.add(new Thread(new Thread2()));
        threads.add(new Thread3());
        threads.add(new Thread4());
        threads.add(new Thread(new Thread5()));
    }

    public static void main(String[] args) {
        for (Thread l : threads) {
            l.start();
            if (l instanceof Thread4) ((Thread4) l).showWarning();
//            if (l instanceof Thread4)   l.showWarning();
            else if (l instanceof Thread1) l.stop();

        }
    }

    static class Thread1 extends Thread {
        @Override
        public void run() {
            while (true) ;
        }
    }

    public static class Thread2 implements Runnable {
        @Override
        public void run() {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }


    static class Thread3 extends Thread {
        public void run() {
            int cnt = 0;
            try {
                while (cnt != 5) {
                    Thread.sleep(500);
                    System.out.println("Ура");
                    cnt++;
                }
            } catch (InterruptedException e) {
                System.out.println("interapt 5 cnt");
            }
        }
    }


    static class Thread4 extends Thread implements Message {
        @Override
        public void showWarning() {
            this.interrupt();
        }

        @Override
        public void run() {
            while (!this.isInterrupted()) {

            }
        }
    }


    static class Thread5 implements Runnable {
        @Override
        public void run() {
            try {
                BufferedReader buff1 = new BufferedReader(new InputStreamReader(System.in));
                String s;
                int chisl = 0;
                while (!(s = buff1.readLine()).equals("N")) chisl = chisl + Integer.parseInt(s);
                System.out.println(chisl);
                buff1.close();

            } catch (IOException e) {
                e.printStackTrace();
            }


        }
    }


}