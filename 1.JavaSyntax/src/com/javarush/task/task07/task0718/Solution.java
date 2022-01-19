package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код

        ArrayList<String> list  = new ArrayList<String>();

        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i <10; i++) {
            list.add( buf.readLine());
        }
        int number=0;
        for (int i = 0; i < list.size()-1; i++) {

            if (list.get(i+1).length()<list.get(i).length()) number =i+1;

        }
        if (number!=0)  System.out.println(number);


    }
}

