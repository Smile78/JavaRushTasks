package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;


/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код

        ArrayList<Integer> listArr= new ArrayList<>();

        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

            for (int i = 0; i <10 ; i++) {
                listArr.add(Integer.parseInt(buf.readLine()));
             }
                int cnt=1;
                int max=1;

            for (int i = 0; i <9 ; i++) {
                if (listArr.get(i).equals(listArr.get(i+1))) {
                  cnt++;
                   if (max<cnt) max=cnt;
                }
                else cnt=1;
            }


        System.out.println(max);
    }
}