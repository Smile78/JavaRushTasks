package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int stop=0;
        int sum=0;
        while (stop!=-1){
            int a = Integer.parseInt(buf.readLine());
            sum=sum+a;
            if (a==-1)  {stop=-1;
                System.out.println(sum);} }
    }
}
