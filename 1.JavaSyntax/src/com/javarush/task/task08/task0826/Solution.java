package com.javarush.task.task08.task0826;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Date;

/* 
Пять победителей
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[ 20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
//            array[i] = (int) (Math.random() * 20);
        }

        sort(array);
//        for (int i = 0; i < 20; i++) {
//            System.out.println(array[i]);
//        }
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
//        System.out.println(array[1026]);
//        System.out.println(array[1027]);
//        System.out.println(array[1028]);
//        System.out.println(array[1029]);
    }

    public static void sort(int[] array) {
        //напишите тут ваш код


        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if(array[j]>array[i]){
                    int temp = array[j];
                    array[j]=array[i];
                    array[i]=temp;
                }
            }
        }


    }

}

