package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
            ArrayList<String>[] arrayOfStringList = createList();
            printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String>[] mass = new ArrayList[3];
            ArrayList<String> list1 = new ArrayList<>();
            ArrayList<String> list2 = new ArrayList<>();
            ArrayList<String> list3 = new ArrayList<>();


            for (int i = 0; i <3; i++) {
                list1.add("xyz"+i);
            }
            for (int i = 0; i <3; i++) {
                list2.add("xyz"+i);
            }
            for (int i = 0; i <3; i++) {
                list3.add("xyz"+i);
            }

                mass[0] = list1;
                mass[1] = list1;
                mass[2] = list1;

        return mass;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}