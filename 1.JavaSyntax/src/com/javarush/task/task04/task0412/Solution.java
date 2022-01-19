package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buf =new BufferedReader(new InputStreamReader(System.in));
        int chis1= Integer.parseInt(buf.readLine());
        int prnt1=0;

        if (chis1>0) prnt1=chis1*2;
        if (chis1<0) prnt1=chis1+1;
        if (chis1==0) prnt1=chis1;
        System.out.println(prnt1);
    }

}