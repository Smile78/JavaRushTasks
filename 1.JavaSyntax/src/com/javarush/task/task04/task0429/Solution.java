package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int ch1 = Integer.parseInt(buf.readLine());
        int ch2 = Integer.parseInt(buf.readLine());
        int ch3 = Integer.parseInt(buf.readLine());

        int kolP=0;
                int kolM=0;

       if (ch1>0)kolP++;
       if (ch2>0)kolP++;
       if (ch3>0)kolP++;
       if (ch1<0)kolM++;
       if (ch2<0)kolM++;
       if (ch3<0)kolM++;

           System.out.println("количество отрицательных чисел: "+kolM);
           System.out.println("количество положительных чисел: "+kolP);
    }
}
