package com.javarush.task.task13.task1318;

import java.io.*;
import java.nio.Buffer;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // напишите тут ваш код

        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String fl= buf.readLine();
        buf.close();
        InputStream inpSt = new FileInputStream(new File(fl));
          try {
              while (inpSt.available() > 0) {
                  System.out.print( (char)inpSt.read());
               }
             }catch (Exception e ){
              System.out.println("нету файла");
            }
              inpSt.close();

    }
}