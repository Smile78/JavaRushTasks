package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> arr = new ArrayList<String>();

        arr.add("Строка1");
        arr.add("Строка2");
        arr.add("Строка3");
        arr.add("Строка4");
        arr.add("Строка5");

        System.out.println(arr.size());

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}
