package com.javarush.task.task08.task0827;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("JANUARY 2 2020"));
//         isDateOdd("MAY 1 2013");
    }

    public static boolean isDateOdd(String date) throws ParseException {

        SimpleDateFormat format = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH);
          Date dateOne = format.parse(date);

             long date1  = dateOne.getTime();
             long dateNY = new Date( dateOne.getYear(), 0, 1).getTime();
               long day = 24*60*60*1000;

//                    boolean bul= ((date1-dateNY)/day +1)%2 !=0;
                    boolean bul2= ((date1-dateNY)/day )%2 ==0;


        return bul2;
    }
}
