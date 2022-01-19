package com.javarush.task.task04.task0422;

/* 
18+
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String name1=  buf.readLine();
        int age=  Integer.parseInt(buf.readLine());

        if (age<18) System.out.println("Подрасти еще");

    }
}
