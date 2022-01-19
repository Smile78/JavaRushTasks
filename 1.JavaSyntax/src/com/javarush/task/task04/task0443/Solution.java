package com.javarush.task.task04.task0443;


/* 
Как назвали, так назвали
*/

import java.io.*;
import java.sql.SQLOutput;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        String name = buf.readLine();
        int year = Integer.parseInt(buf.readLine());
        int mnth = Integer.parseInt(buf.readLine());
        int day = Integer.parseInt(buf.readLine());
        System.out.println("Меня зовут "+name+".");
        System.out.println("Я родился "+day+"."+mnth+"."+year);
    }
}
