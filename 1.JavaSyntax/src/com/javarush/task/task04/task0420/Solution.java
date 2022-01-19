package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int cif1 = Integer.parseInt(buf.readLine());
        int cif2 = Integer.parseInt(buf.readLine());
        int cif3 = Integer.parseInt(buf.readLine());

        int min3 = 0;
        int min2 = 0;
        int min1 = 0;

        if (cif1 <= cif3) {
           if (cif1 <= cif2){
               if (cif2<=cif3) {min3=cif3;min2=cif2;min1=cif1;}
               else if (cif3<=cif2){min3=cif2;min2=cif3;min1=cif1;}
           }
        }

        if (cif2<=cif1){
            if (cif2<=cif3){
                if (cif1<=cif3){min3=cif3;min2=cif1;min1=cif2;}
                else if (cif3<=cif1){min3=cif1;min2=cif3;min1=cif2;}
            }
        }

        if (cif3<=cif1){
            if (cif3<=cif2){
                if (cif1<=cif2){min3=cif2;min2=cif1;min1=cif3;}
                else if (cif2<=cif1){min3=cif1;min2=cif2;min1=cif3;}
            }
        }



        System.out.println(min3 + " " + min2 + " " + min1 + " ");

    }
}
