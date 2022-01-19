package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<Character, Integer> hsh = new LinkedHashMap<>();

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        // напишите тут ваш код

            int cntI=0;
            for (int j = 0; j < alphabet.size(); j++) {
                for (int i = 0; i <list.size() ; i++) {
                    String str = list.get(i);
                     char[] chr =str.toCharArray();
                        for (int k = 0; k < chr.length; k++) {
                            if (chr[k]==(alphabet.get(j))) {
                                cntI++;
                            }
                        }
                 }
            hsh.put(alphabet.get(j) ,cntI);
            cntI=0;
        }

        for(Map.Entry tM:hsh.entrySet())
            System.out.println(tM.getKey()+" "+tM.getValue());
    }
}
