package com.javarush.task.task01.task0131;

/* 
Полнометражная картина
*/

import java.rmi.MarshalException;

public class Solution {

    public static int getMetreFromCentimetre(int centimetre) {
        //напишите тут ваш код

                return Math.round(centimetre/100);


    }

    public static void main(String[] args) {
        System.out.println(getMetreFromCentimetre(243));
    }


}