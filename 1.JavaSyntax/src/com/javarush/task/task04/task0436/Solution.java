package com.javarush.task.task04.task0436;


/* 
Рисуем прямоугольник
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int ch1 = Integer.parseInt(buf.readLine());
        int ch2 = Integer.parseInt(buf.readLine());

        for (int i = 0; i <ch1 ; i++) {

            for (int j = 0; j <ch2 ; j++) {
                System.out.print("8");
            }
            System.out.println("");
        }
    }
}
