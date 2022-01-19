package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String[] mass =new  String[10];


        for (int i = 0; i <8 ; i++) {
            mass[i]= buf.readLine();
        }

        for (int i = mass.length-1; i >=0; i--) {
            System.out.println(mass[i]);
        }



    }
}