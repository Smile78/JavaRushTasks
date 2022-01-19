package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
            BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
            String str = buf.readLine();
            char[] chr = str.toCharArray();

            String strVow ="";
            String strCons ="";


        for (int i = 0; i <chr.length ; i++) {
            if (isVowel(chr[i])==true){
                strVow+= chr[i];
                strVow+= " ";
            } else if (chr[i]==' ')  continue;
//            } else if (chr[i]==' ')  strCons+="";
              else {strCons+=chr[i];
                    strCons+=" ";
              }


        }

        System.out.println(strVow);
        System.out.println(strCons);


    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}