package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int x=1;
        int y=1;

        while (x<=10){
            System.out.print(x*1+" ");
            System.out.print(x*2+" ");
            System.out.print(x*3+" ");
            System.out.print(x*4+" ");
            System.out.print(x*5+" ");
            System.out.print(x*6+" ");
            System.out.print(x*7+" ");
            System.out.print(x*8+" ");
            System.out.print(x*9+" ");
            System.out.print(x*10+" ");
            System.out.println("");
            x++;
        }
    }
}
