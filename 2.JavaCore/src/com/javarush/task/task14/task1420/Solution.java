package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        int i1 = Integer.parseInt(buf.readLine());
        String ch2 = buf.readLine();
        int i2 = Integer.parseInt(ch2);
        if (i1 <= 0 || i2 <= 0) throw new Exception();
        int f;

        while (i2 != 0) {
            f = i1 % i2;
            i1 = i2;
            i2 = f;
        }
        System.out.println(i1);

    }
}
