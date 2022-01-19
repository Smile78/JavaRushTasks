package com.javarush.task2.task16.t1632;


//import sun.util.BuddhistCalendar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Клубок
*/

public class Test1632 {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
         threads.add(new Tr1() );
         threads.add(new Tr2() );
         threads.add(new Tr3() );
         threads.add(new Tr4() );

         System.out.println("piu static end");
//         threads.add(new Tr5() );


    }

    public static void main(String[] args) throws InterruptedException {
        for (Thread tr:threads ) {
            tr.start();

//            if (tr instanceof Tr1) tr.stop();
             if (tr instanceof Tr2) tr.interrupt();
            else if (tr instanceof Tr4 ) ((Tr4) tr).showWarning();
        }
        System.out.println("piu main end");

       Thread.sleep(5000);

       for (Thread tr:threads ) {
           tr.stop();

       }

    }


    public static class Tr1 extends Thread{

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
                System.out.println("Tr1");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

    public static  class Tr2 extends Thread{
    public void run(){
        try {
           Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException tr2");
        }
    }
}

    public static class Tr3 extends Thread{
    public void run() {
        int cnt=0;
        while (cnt!=3) {
            try {
                Thread.sleep(500);
                System.out.println("Ура");
                cnt++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

    public static class Tr4 extends Thread implements Message{


    public void run() {
        while(isInterrupted()){

        }
    }

    @Override
    public void showWarning() {
//        Thread.currentThread().interrupt();
        this.interrupt();
        System.out.println("showwrn tr4");
    }
}

    public static class Tr5 extends Thread  {


        public void run() {
            BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
            String str;
            int sum=0;

            while(true) {
                try {
                    if (!(str = buf.readLine()).equals("N"))  sum+=Integer.parseInt(str);
                    System.out.println(sum);
                    buf.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }


            }


        }
    }



}