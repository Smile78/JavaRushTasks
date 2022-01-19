package com.javarush.task.task12.task1210;

/* 
Три метода и максимум
*/

public class Solution {
    public static void main(String[] args) {

    }

    //Напишите тут ваши методы

    public static int max(int a, int b){
        int max =a;
        if (a>b) max=a;
        if (a<b) max=b;
        return max;
    }
    public static long max(long a, long b){
        long max =a;
        if (a>b) max=a;
        if (a<b) max=b;
        return max;
    }
    public static double max(double a, double b) {
        double max =a;
        if (a>b) max=a;
        if (a<b) max=b;
        return max;
    }
}
