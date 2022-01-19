package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

import static java.util.Arrays.sort;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int[] mass=new int[3];
        mass[0]= Integer.parseInt(buf.readLine());
        mass[1] = Integer.parseInt(buf.readLine());
        mass[2] = Integer.parseInt(buf.readLine());
        sort(mass);
        System.out.println(mass[1]);
    }
}
