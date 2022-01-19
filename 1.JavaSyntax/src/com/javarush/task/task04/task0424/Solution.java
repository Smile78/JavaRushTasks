package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int ch1 = Integer.parseInt(buf.readLine());
        int ch2 = Integer.parseInt(buf.readLine());
        int ch3 = Integer.parseInt(buf.readLine());

        if (ch1==ch2) System.out.println("3");
        if (ch2==ch3) System.out.println("1");
        if (ch3==ch1) System.out.println("2");
    }
}
