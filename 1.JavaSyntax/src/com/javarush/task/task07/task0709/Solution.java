package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> arr = new ArrayList<String>();
        ArrayList<String> arrMin = new ArrayList<String>();

        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i <5 ; i++) {
            arr.add(buf.readLine());
        }

        String minStr = arr.get(0);
        int maxlength=0;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).length()<minStr.length()) {
                minStr=arr.get(i);
            }
        }

        maxlength=minStr.length();


        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).length()==minStr.length()) {
                arrMin.add(arr.get(i));
            }
        }

        for (int i = 0; i < arrMin.size(); i++) {
            System.out.println(arrMin.get(i));
        }


    }
}
