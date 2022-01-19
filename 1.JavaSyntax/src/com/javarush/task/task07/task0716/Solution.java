package com.javarush.task.task07.task0716;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();

        list.add("роза"); //0
        list.add("лоза"); //1
        list.add("лола"); //1
        list.add("рор"); //1
        list.add("лира"); //2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list ) {
        //напишите тут ваш код

        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
                if (str.contains("л")&&str.contains("р")) continue;
                    else if (str.contains("л")){
                        list.add(i,list.get(i));
                        i++;
                    }
                    else if (str.contains("р")) {
                         list.remove(i);
                         i--;
                        }

        }

        return list ;
    }
}