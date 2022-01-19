package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        // создай и заполни массив
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int[] mass =new  int[20];

        int a;

        for (int i = 0; i <20 ; i++) {
            a= Integer.parseInt(buf.readLine());
            mass[i]=a;
        }
        return mass;
    }

    public static int max(int[] array) {
        // найди максимальное значение
        int max=array[0];
        for (int i = 0; i <array.length; i++) {
            if (array[i]>max) max=array[i];
        }
        return max;
    }
}
