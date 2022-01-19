package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String str = buf.readLine();
        int razr = str.length();
        int ch = Integer.parseInt(str);

        for (int i = 0; i < razr; i++) {

            if ((ch % 10) % 2 == 0) {
                even++;
                ch = Math.round(ch / 10);
            } else if ((ch % 10) % 2 != 0) {
                odd++;
                ch = Math.round(ch / 10);
            }
        }

        System.out.println("Even: " + even + " Odd: " + odd);

    }
}
