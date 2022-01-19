package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        int chis1=Integer.parseInt(buf.readLine());
        int chis2=Integer.parseInt(buf.readLine());
        int chis3=Integer.parseInt(buf.readLine());

            if (chis3==chis2&&chis2==chis1) System.out.print(chis1+" "+chis2+" "+chis3);
            else{
            if (chis1==chis2) System.out.print(chis1+" "+chis2);
            if (chis2==chis3) System.out.print(chis2+" "+chis3);
            if (chis3==chis1) System.out.print(chis3+" "+chis1);}

    }
}