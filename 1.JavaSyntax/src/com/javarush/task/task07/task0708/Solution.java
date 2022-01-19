package com.javarush.task.task07.task0708;

import javafx.scene.control.ButtonBar;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static  List<String> strings;


    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        strings = new ArrayList<String>();
        ArrayList<String> stringsMax = new ArrayList<String>();

        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i <5 ; i++) {
            strings.add(buf.readLine());
        }

            String maxStr = strings.get(0);
            int maxlength=0;

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length()>maxStr.length()) {
                maxStr=strings.get(i);
            }
        }

        maxlength=maxStr.length();

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length()==maxStr.length()) {
                stringsMax.add(strings.get(i));
            }
        }

        for (int i = 0; i < stringsMax.size(); i++) {
            System.out.println(stringsMax.get(i));
        }




    }
}
