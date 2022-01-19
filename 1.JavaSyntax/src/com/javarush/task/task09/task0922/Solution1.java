package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Solution1 {
    public static void main(String[] args) throws Exception {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));


            String str = buf.readLine();


        SimpleDateFormat dat1 = new SimpleDateFormat("yyyy-MM-d");
                Date inp = dat1.parse(str);


        SimpleDateFormat dat2 = new SimpleDateFormat("MMM dd,yyyy");
                String dt2 = dat2.format(inp).toUpperCase();

        System.out.println(dt2);



    }

}
