package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/*
Массив списков строк
*/

public class Solution1 {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String>[] arrList = new ArrayList [3];

        for (int i = 0; i <arrList.length ; i++) {
            String str2 = "arr"+i;
            ArrayList listNew= new ArrayList<String>();
                for (int j = 0; j < 3 ; j++) {
                    listNew.add(str2+"_xyz"+j);
                }
             arrList[i] = listNew;
        }
        return arrList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}