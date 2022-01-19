package com.javarush.task.task15.task1517;

/* 
Статики и исключения
*/

import java.io.IOException;

public class Solution {
    public static int A = 0;

    static {

        //throw an exception here - выбросьте эксепшн тут

        System.out.println(A/0);

//        try{
//            System.out.println(A/0);
////            System.out.println(A*B);
//
//        }catch(ArithmeticException e){
//            System.out.println(e);
//        }

    }

    public static int B = 5;

    public static void main(String[] args) {

        System.out.println(B);
    }
}
