package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Омовение Рамы
*/

public class Solution1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
            char[] chr= string.toCharArray();
              chr[0]=Character.toUpperCase(chr[0]);
                    for (int i = 0; i < chr.length-1; i++) {
                        if (chr[i]==' ') chr[i+1]=Character.toUpperCase(chr[i+1]);
                    }

        //напишите тут ваш код

        System.out.println(chr);
    }
}
