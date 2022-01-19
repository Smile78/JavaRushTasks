package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String chis1 = reader.readLine();
        String chis2 = reader.readLine();
        System.out.print(name+" получает "+chis1+" через "+chis2+" лет.");
    }
}
