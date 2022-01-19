package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        ArrayList<String> arr = new ArrayList<String>();

        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i <10; i++) {
            arr.add(buf.readLine());
            }

            String maxStr  = arr.get(0);
            String minStr = arr.get(0)  ;
            int maxNmb=0;
            int minNmb=0;

        for (int i = 0; i <arr.size(); i++) {
            if (arr.get(i).length()>maxStr.length()){
                maxStr= arr.get(i);
                maxNmb=i;
            }

            if (arr.get(i).length()<minStr.length()){
                minStr= arr.get(i);
                minNmb=i;
            }

        }

        if (maxNmb<minNmb)  System.out.println(arr.get(maxNmb));
        else if (maxNmb>minNmb) System.out.println(arr.get(minNmb));

//        System.out.println("maxNmb "+maxNmb + "  maxStr "+maxStr);
//        System.out.println("minNmb "+minNmb + "  minStr "+minStr);




    }
}
