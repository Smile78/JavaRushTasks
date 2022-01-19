package com.javarush.task.task05.task0532;

import java.io.*;

import static java.util.Arrays.sort;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int[] mass = new int[a];

        for (int i=0;i<a; i++){
            mass[i]= Integer.parseInt(reader.readLine());

        }
            sort(mass);

        int maximum = mass[mass.length-1] ;

        //напишите тут ваш код

        System.out.println(maximum);
    }
}
