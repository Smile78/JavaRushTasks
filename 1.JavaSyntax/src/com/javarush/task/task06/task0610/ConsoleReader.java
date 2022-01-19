package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        //напишите тут ваш код

        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        return buf.readLine();
    }

    public static int readInt() throws Exception {
        //напишите тут ваш код
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(buf.readLine());
    }

    public static double readDouble() throws Exception {
        //напишите тут ваш код
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        return Double.parseDouble(buf.readLine());
    }

    public static boolean readBoolean() throws Exception {
        //напишите тут ваш код
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        return Boolean.parseBoolean(buf.readLine());

    }

    public static void main(String[] args) {

    }
}
