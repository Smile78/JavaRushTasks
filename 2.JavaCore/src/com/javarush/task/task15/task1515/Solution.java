package com.javarush.task.task15.task1515;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Статики-2
*/

public class Solution {
    public static int A;
    public static int B;

    static{

        try {
            BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
//            System.out.print("Введите int a: ");
             A = Integer.parseInt(buf.readLine());
//            System.out.print("Введите int b: ");
             B = Integer.parseInt(buf.readLine());
            buf.close();
        } catch (IOException e){
//            System.out.println("надо было int");
            e.printStackTrace();
        }

    }


    public static final int MIN = min(A, B);

    public static void main(String[] args) {
        System.out.println(MIN);
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}
