package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] par = new URL(reader.readLine()).getQuery().split("&");

        for (String str : par) {
            if (!str.contains("=")) {
                System.out.print(str + " ");
            } else {
                System.out.print(str.substring(0, str.indexOf("=")) + " ");
            }
        }
//        System.out.println();
        for (String str : par) {
            String object = null;
            if (str.contains("obj")) {
                 object = str.substring(str.indexOf("=") + 1);
                try {

                        alert(Double.parseDouble(object));

                } catch (NumberFormatException e) {
                    alert(object);
                }
            }


        }

    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
