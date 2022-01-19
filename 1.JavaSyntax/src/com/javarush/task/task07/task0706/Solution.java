package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        int[] mass0 = new int[15];
//        int[] massChtn = new int[7];
//        int[] massNechetn = new int[8];
        int chSum=0;
        int NechSum=0;

        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 15; i++) {
            mass0[i] = Integer.parseInt(buf.readLine());
        }

        for (int i = 0; i <15 ; i=i+2) {
            chSum=chSum+mass0[i];
        }
        for (int i = 1; i <15 ; i=i+2) {
            NechSum=NechSum+mass0[i];
        }

        if (chSum>NechSum) System.out.println("В домах с четными номерами проживает больше жителей.");
        else  System.out.println("В домах с нечетными номерами проживает больше жителей.");

    }
}
