package com.javarush.task2.task16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1616 {

    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);
        //create and run thread
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start();
        //read a string
        reader.readLine();
        stopwatch.interrupt();
        //close streams
        reader.close();
        in.close();
    }

    public static class Stopwatch extends Thread {
        private int seconds;

        public void run() {
            try {
                //напишите тут ваш код
               while(!isInterrupted()){
                Thread.sleep(1000);
                seconds++; }

            } catch (InterruptedException e) {
                System.out.println(seconds);
            }
        }
    }
}
