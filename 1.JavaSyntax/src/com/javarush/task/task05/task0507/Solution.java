package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.BufferOverflowException;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код


        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int stop = 0;
        int sum=0;
        int cnt=0;
        double sr=0.00;

        while (stop!=-1) {
            int ch = Integer.parseInt(buf.readLine());
            if (ch!=-1){
                sum=sum+ch;
                cnt++;} else if (ch==-1) stop=-1;
        }
        sr = (double) sum/(double)cnt ;
        System.out.println(sr);
    }
}

