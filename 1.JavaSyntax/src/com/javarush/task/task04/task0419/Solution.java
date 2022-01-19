package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int chis1=Integer.parseInt(buf.readLine());
        int chis2=Integer.parseInt(buf.readLine());
        int chis3=Integer.parseInt(buf.readLine());
        int chis4=Integer.parseInt(buf.readLine());

        int max=0;

          if (chis1>=chis2&&chis1>=chis3&&chis1>=chis4) max=chis1;
        else if (chis2>=chis1&&chis2>=chis3&&chis2>=chis4) max=chis2;
        else if (chis3>=chis1&&chis3>=chis2&&chis3>=chis4) max=chis3;
        else   max= chis4;

        System.out.println(max);


    }
}
