package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Solution1 {
    public static void main(String[] args) throws IOException {
        BufferedReader buf  = new BufferedReader(new InputStreamReader(System.in));
        int x =0;
        while(true){
            String s= buf.readLine();
            if (s.equals("сумма")) break;
            x+= Integer.parseInt(s);

        }
        System.out.println(x);


    }


}
