package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String str =  buf.readLine();
        int N = Integer.parseInt(buf.readLine());



        while(N>0){
            System.out.println(str);
            N--;
        }

    }
}
