package com.javarush.task.task16.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();

        //add your code here - добавьте код тут
        t1.start();
        t1.join();
        t1.printResult();

        t2.start();
        t2.join();
        t2.printResult();

//        t1.interrupt();
//        t2.interrupt();

//        reader.close();

    }

    //add your code here - добавьте код тут
    public static class Read3Strings extends Thread{
//        private      static  String str1;
//        private      static String str2;
//        private      static String str3;
       public static String all;
//        static String all;
//        public static ArrayList<String> list = new ArrayList();


        @Override
        public void run() {
            try {
//            if(reader.ready()) {
//       String str1;
//   String str2;
//  String str3;

                String   str1 = reader.readLine();
                String   str2 = reader.readLine();
                String   str3 = reader.readLine();
//                for (int i = 0; i < 3; i++) {
//                    all += reader.readLine() + " ";
//                }

                 all = str1+" "+str2+" "+str3+" ";
//                 list.add(str1+" "+str2+" "+str3+" ");
//            }
            } catch (IOException e) {
                System.out.println("IO");
            }


        }
        public   void printResult(){
//            System.out.println(list.get(0));
//            String all  = str1+" "+str2+" "+str3+" ";

            System.out.println(all);
//            System.out.println(str1+" "+str2+" "+str3+" ");
        }
    }
}
