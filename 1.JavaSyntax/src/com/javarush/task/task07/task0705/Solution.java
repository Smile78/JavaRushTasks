package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        int[] mass0 = new int[20];
        int[] mass11 = new int[10];
        int[] mass12 = new int[10];

        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++) {
            mass0[i] = Integer.parseInt(buf.readLine());
        }

        for (int i =  0; i <10 ; i++) {
            mass11[i]=mass0[i];
            mass12[i]=mass0[i+10];
        }



        for (int i = 0; i < 10; i++) {
            System.out.println(mass12[i]);
        }

    }
}
