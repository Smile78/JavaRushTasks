package com.javarush.task.task08.task0827;

import java.util.Date;

/*
Работа с датой
*/

public class Solution1 {
    public static void main(String[] args) {
        System.out.println(isDateOdd("JANUARY 2 2020"));
    }

    public static boolean isDateOdd(String date) {

        Date   dateInput = new Date(date);

        Date currentTime = new Date();

        long msTimeDistance = currentTime.getTime() - dateInput.getTime();
        long msDay = 24 * 60 * 60 * 1000;                                    //сколько миллисекунд в одних сутках

        if (( (msTimeDistance/msDay)+1)%2==0 )  return true;return false;

    }
}
