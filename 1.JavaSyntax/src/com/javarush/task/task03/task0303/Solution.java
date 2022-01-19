package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(convertEurToUsd(90,90));

        System.out.println(convertEurToUsd(400,90));
    }

    public static double convertEurToUsd(int eur, double course) {
        //напишите тут ваш код
        double usd = eur*course;
        return usd;
    }
}
