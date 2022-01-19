package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        double time = Double.parseDouble(buf.readLine());

        if (time%5<3) System.out.println("зеленый");
        if (time%5>=3&&time%5<4) System.out.println("желтый");
        if (time%5>=4&&time%5<5) System.out.println("красный");

    }
}