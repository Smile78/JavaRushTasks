package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        String fl= buf.readLine();
        BufferedWriter  writ  = new BufferedWriter(new FileWriter(fl));
//        BufferedWriter  writ  = new BufferedWriter(new OutputStreamWriter(System.out));
//        OutputStream outSt = new FileOutputStream(fl);


        while (true ){
            String txt= buf.readLine();

            if (txt.equals("exit")){
                    writ.write(txt);
                    writ.newLine();
                    break;
                }

            writ.write(txt);
            writ.newLine();
        }


        buf.close();
        writ.close();
//        outSt.close();

    }
}
