package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Задача по алгоритмам
*/

public class Solution1 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
//            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            list.add( s);
//            list.add(Integer.parseInt(s));
        }

        String[] array = list.toArray(new String[0]);
//        Integer[] array = list.toArray(new Integer[0]);
        sort(array);

//        for (Integer x : array) {
        for (String x : array) {
            System.out.println(x);
        }
    }

//    public static void sort(Integer[] array) {
    public static void sort(String[] array) {
        // напишите тут ваш код,

        for (int i = 0; i <array.length; i++) {
            for (int j = i; j <array.length; j++) {
                if (isNumber(array[i]) &&isNumber(array[j])&&Integer.parseInt(array[i])< Integer.parseInt(array[j])){
                    String tmp = array[j];
                    array[j]=array[i];
                    array[i]=tmp;
                }
                if (!isNumber(array[i]) && !isNumber(array[j])&&isGreaterThan(array[i],array[j])){
                    String tmp = array[j];
                    array[j]=array[i];
                    array[i]=tmp;
                }

            }
        }

//        for (int i = 0; i <array.length; i++) {
//            for (int j = i; j <array.length; j++) {
//
//            }
//        }


//        for (int i=0; i<array.length-1;i++){
//        for (int k=0; k<array.length;k++) {
//            if (isNumber(array[i]) &&isNumber(array[k])&& (Integer.parseInt(array[k])) > (Integer.parseInt(array[i]))) {
//                String tmp = array[i];
//                array[i] = array[i + 1];
//                array[i + 1] = tmp;
//            }
//        }
//        }


//        for (int i=0; i<array.length-2;i=i+2){
//            for (int k=i+2; k<array.length;k=k+2)
//                if (isNumber(array[i])) {
//                    if (Integer.parseInt(array[i]) < Integer.parseInt(array[k + 1])) {
//                        String tmp = array[i];
//                        array[i] = array[k + 1];
//                        array[k + 1] = tmp;
//                    }
//                }
//        }


    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
