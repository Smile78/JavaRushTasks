package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] masCh =new  int[10];
        String[] masStr =new  String[10];

        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i <10; i++) {
            masStr[i]= buf.readLine();
        }

        for (int i = 0; i <10; i++) {
            masCh[i]= masStr[i].length();
        }

        for (int i = 0; i <10; i++) {
            System.out.println(masCh[i]);
        }

    }
}
