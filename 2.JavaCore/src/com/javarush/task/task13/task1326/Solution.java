package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
        // напишите тут ваш код
        ArrayList<Integer> arrL = new ArrayList<>();
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
            String fl= buf.readLine();
                buf.close();

        FileInputStream fl1 = new FileInputStream(fl);

        BufferedReader buf2 = new BufferedReader(new InputStreamReader(fl1));
        String txt = "";

                while ((txt = buf2.readLine()) != null) {
                    if (Integer.parseInt(txt) % 2 == 0) {
                        arrL.add(Integer.parseInt(txt));
                    }
                }


        Collections.sort(arrL);

            for(Integer arr:arrL){
                System.out.println(arr);
            }

        buf2.close();
            fl1.close();
    }
}
