package com.javarush.task.task08.task0811;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* 
Квартет «Методы»
*/

public class Solution {
    public static List getListForGet( ) {
        //напишите тут ваш код
        ArrayList listArr = new ArrayList();
                listArr.add("1");
               listArr.get(0);
        return listArr;

    }

    public static List getListForSet() {
        //напишите тут ваш код
        ArrayList list = new ArrayList();
        list.add("1");
            list.set(0,"1");


        return list;

    }

    public static List getListForAddOrInsert() {
        //напишите тут ваш код
        LinkedList list = new LinkedList();
        list.add(0,"1");
            return list;
    }

    public static List getListForRemove() {
        //напишите тут ваш код
        LinkedList list = new LinkedList();
        list.add("1");

        list.remove(0);
        return list;
    }

    public static void main(String[] args) {


    }
}
