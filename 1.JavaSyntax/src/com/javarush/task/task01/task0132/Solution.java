package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {




    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }



    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        int cif3= number%10;
        int chis2=Math.round(number/10);
        int cif2 =chis2%10;
        int cif1 =Math.round(number/100);
                return  cif1+cif2+cif3;

    }
}
