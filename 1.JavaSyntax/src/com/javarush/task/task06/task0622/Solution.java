package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

import static java.util.Arrays.sort;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] mass = new int[5];
        //напишите тут ваш код

        for (int i = 0; i <5 ; i++) {
            mass[i]=Integer.parseInt(reader.readLine());
        }

        sort(mass);

        for (int i = 0; i < mass.length; i++) {
            System.out.println(mass[i]);
        }
    }
}
