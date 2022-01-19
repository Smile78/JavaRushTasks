package com.javarush.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Совершенствуем функциональность
*/

public class Solution1 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer[] mass = new Integer[5];


        for (int i = 0; i <= 4; i++) {
            mass[i] = Integer.parseInt(reader.readLine());
        }
        int min=mass[0];
        for (int i = 0; i <mass.length ; i++) {
            if (mass[i]< min) min = mass[i];
        }


        System.out.println("Minimum = " + min);

    }



}
