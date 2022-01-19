package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import static java.util.Arrays.sort;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));



        //напишите тут ваш код

            int[] arr = new int[20];
        ArrayList<String> list =  new ArrayList<String>();


        for (int i = 0; i <20 ; i++) {
            arr[i]= Integer.parseInt(reader.readLine());
        }

        int maximum = arr[0];
        int minimum = arr[0];

        for (int i = 0; i <20 ; i++) {
            if (arr[i]>maximum) maximum= arr[i];
            if (arr[i]<minimum) minimum= arr[i];
        }



        System.out.print(maximum + " " + minimum);
    }
}
