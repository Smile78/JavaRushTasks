package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        int strn1=Integer.parseInt(buf.readLine());

        int strn2=Integer.parseInt(buf.readLine());

        int strn3=Integer.parseInt(buf.readLine());

        if (strn1+strn2<=strn3) System.out.println("Треугольник не существует.");
        else {
            if (strn2 + strn3 <= strn1) System.out.println("Треугольник не существует.");
            else {
                if (strn1 + strn3 <= strn2) System.out.println("Треугольник не существует.");
                  else System.out.println("Треугольник существует.");
            }
        }
    }
}