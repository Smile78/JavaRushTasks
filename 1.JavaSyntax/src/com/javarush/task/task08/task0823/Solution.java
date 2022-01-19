package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
            char[] ch = s.toCharArray();
                for (int i = 0; i <s.length()-1 ; i++) {
                   if (ch[0]!=' ') ch[0]=Character.toUpperCase(ch[0]);
                    if (ch[i]==' '&&ch[i+1]!=' ')   {
                        ch[i+1]=Character.toUpperCase(ch[i+1]);
                    }
                }
        String myStr = new String(ch);
        System.out.println(myStr);
        //напишите тут ваш код


    }
}
