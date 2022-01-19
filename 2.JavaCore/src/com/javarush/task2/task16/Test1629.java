package com.javarush.task2.task16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1629 {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        t1.join();
        Read3Strings t2 = new Read3Strings();

        //add your code here - добавьте код тут

        t2.join(); // без этого -- хреновый вывод (поскольку сразу вывод без ввода второй нити...

        t1.printResult();
        t2.printResult();
    }

    //add your code here - добавьте код тут
    public static class Read3Strings extends Thread {
        String[] str = new String[3];
        String strAll = "";

        Read3Strings() {
            start();
        }

        @Override
        public void run() {

//            try {
//                String str1 =  reader.readLine();
//                String str2 =  reader.readLine();
//                String str3 =  reader.readLine();
//
//                strAll= str1+" "+str2+" "+str3+" ";
//
//            } catch (IOException e) {
//                e.printStackTrace();
//            }


//        int cnt=0;
//            while (cnt<3){
//                try {
//                    System.out.println("тред:" +this.getName());
//                    strAll += reader.readLine();
//                    cnt++;
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }


            try {
                if (reader.ready()) {
                    for (int i = 0; i < 3; i++) {
                        str[i] = reader.readLine();
//                        strAll += reader.readLine();
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }




        }

        public void printResult() {
            for (int i = 0; i < str.length; i++) {
                System.out.print(str[i] + " ");
            }
//            System.out.println(strAll);
        }


    }
}
