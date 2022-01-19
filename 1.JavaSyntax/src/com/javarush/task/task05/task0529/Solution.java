package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int stop=0;
        int sum=0;

        while (stop!=-1){
            String str = buf.readLine();


            if (!str.equals("сумма")) {
                int ch = Integer.parseInt(str);
                sum=sum+ch;
               } else stop=-1;

        }

        System.out.println(sum);
        }
    }

