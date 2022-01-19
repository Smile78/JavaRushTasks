package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.util.Arrays.sort;

/*
Минимаксы в массивах
*/

public class sol2{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;

        //напишите тут ваш код

        int[] arr = new int[20];

        for (int i = 0; i <20 ; i++) {
            arr[i]= Integer.parseInt(reader.readLine());
        }

        sort(arr);

        maximum=arr[19];
        minimum=arr[0];

        System.out.print(maximum + " " + minimum);
    }
}
