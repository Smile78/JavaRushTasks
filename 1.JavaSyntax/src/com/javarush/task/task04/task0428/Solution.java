package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int ch1 = Integer.parseInt(buf.readLine());
        int ch2 = Integer.parseInt(buf.readLine());
        int ch3 = Integer.parseInt(buf.readLine());

        if (ch1>0&&ch2>0&&ch3>0) System.out.println("3");
        else if (ch1>0&&ch2>0||ch2>0&&ch3>0||ch3>0&&ch1>0) System.out.println("2");
        else if (ch1>0||ch2>0||ch3>0) System.out.println("1");
        else System.out.println("0");
    }
}
