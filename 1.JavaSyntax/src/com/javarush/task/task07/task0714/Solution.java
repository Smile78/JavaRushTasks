package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Слова в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> arr  = new ArrayList<String>();


        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i <5; i++) {
            arr.add( buf.readLine());
        }

        arr.remove(2);

        for (int i = arr.size()-1; i >=0; i--) {
            System.out.println(arr.get(i));
        }

    }
}


