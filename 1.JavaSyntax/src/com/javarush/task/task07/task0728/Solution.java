package com.javarush.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;



/* 
В убывающем порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<Integer>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        //напишите тут ваш код
        int max;
        int mid;
        int min;
        int cnt = 1;
        int mmry;


            for (int i = array.length - 1; i >0 ; i--) {
                for (int j = 0; j < i; j++) {
                    if (array[j] <array[j+1]) {
                        mmry = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = mmry;

                }

                }
            }


        }
    }



