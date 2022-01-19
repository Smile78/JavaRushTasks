package com.javarush.task.task04.task0441;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sol2 {
    public static void main(String[] args) throws IOException {
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(buf.readLine());
    int b = Integer.parseInt(buf.readLine());
    int c = Integer.parseInt(buf.readLine());
        int mid=0;

         if (a<b && a<c) {
             if (b < c) mid = b;
             else if (b > c) mid = c;
         }

         if (a>b && a>c){
             if (b>c) mid =b;
             else if (b<c) mid =c;
         }

         if (a>b&&a<c&&b<c) mid=a;
         if (a<b&&a>c&&b>c) mid=a;




        System.out.println(mid);
}}
