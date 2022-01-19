package com.javarush.task.task05.task0532;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class SolutionMax{


    public static void main (String[] args) throws IOException {
        BufferedReader buff= new BufferedReader(new InputStreamReader(System.in));
        int a=0;
        while (a<=0) {
            System.out.println("введите число больше 0");
            a = Integer.parseInt(buff.readLine());
        }



        int[] mass = new int[a];

        for (int i=0; i<a;i++){
            mass[i]= Integer.parseInt(buff.readLine());
        }

        int max=mass[0];
        for (int i=0; i<a;i++){
            if (mass[i]>max) max=mass[i];
        }
        System.out.println("максимальное число "+ max);


    }



}
