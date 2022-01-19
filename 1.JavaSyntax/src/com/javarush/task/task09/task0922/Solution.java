package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        String dataStr= buf.readLine();

        SimpleDateFormat form1D = new SimpleDateFormat("yyyy-MM-dd" );
        Date oldD =  form1D.parse(dataStr);


        SimpleDateFormat form2D = new SimpleDateFormat("MMM d, yyyy",Locale.ENGLISH);
        System.out.println(form2D.format(oldD).toUpperCase());

    }
}
