package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int chis1=Integer.parseInt(buf.readLine());
        int chis2=Integer.parseInt(buf.readLine());

        if(chis1==chis2) System.out.println(chis1);
        else if (chis1<chis2) System.out.println(chis1);
        else System.out.println(chis2);

    }
}