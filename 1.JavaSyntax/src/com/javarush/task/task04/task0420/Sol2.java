package com.javarush.task.task04.task0420;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sol2 {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(buf.readLine());
        int b = Integer.parseInt(buf.readLine());
        int c = Integer.parseInt(buf.readLine());

        int max=0;
        int mid=0;
        int min=0;

            if (a<=b&&a<=c)
                min=a;
                if (b<=c){
                    mid=b;
                    max=c;}
                else{
                    mid=c;
                    max=b;}

           if  (b<=a&&b<=c)
               min=b;
                if (a<=c){
                    mid = a;
                    max=c;}
                else {
                    mid = c;
                    max=a;
                }

            if (c<=a&&c<=b)
                min =c;
                if (b<=a){
                 mid=b;
                 max=a;}
               else{
                 mid=a;
                 max=b;}



        System.out.println(max + " " + mid + " " + min + " ");
    }
}
