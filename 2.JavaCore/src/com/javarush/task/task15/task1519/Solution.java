package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args)  throws IOException  {
        //напиште тут ваш код

        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Введите числа целочисленные или нет или exit для выхода");

        String str ;

        while (true) {
//            try{
             str = buf.readLine();

                if (str.equals("exit")) break;
                else
                    try {
                        if (str.contains(".")) {
                            try {
                                print(Double.parseDouble(str));
                            } catch (NumberFormatException e) {
                                print(str);
                            }

                        } else if (Integer.parseInt(str) <= 0 || Integer.parseInt(str) >= 128)
                            print(Integer.parseInt(str));
                        else if (Short.parseShort(str) > 0 && Short.parseShort(str) < 128) print(Short.parseShort(str));
                    } catch (NumberFormatException e)
                    { print(str);}



//            }
//            catch(IOException e){
//                System.out.println("HZ");
//            }
        }






//        List<String> list = new ArrayList<>();
//
//        while (true) {
//            String str = buf.readLine();
//
//            if (str.equals("exit"))  break ;
//            else  list.add(str);
//
//        }
//
//        buf.close();
//
//            for (String lst : list) {
//                 if (lst.contains(".")) {
//                    try {
//                        print(Double.parseDouble(lst));
//                    } catch (NumberFormatException e) {
//                        print(lst);
//                    }
//                } else if (Integer.parseInt(lst) <= 0 || Integer.parseInt(lst) >= 128) print(Integer.parseInt(lst));
//                else if (Short.parseShort(lst) > 0 && Short.parseShort(lst) < 128) print(Short.parseShort(lst));
//                else print(lst);
//            }
//        }


         } //

        public static void print (Double value){
            System.out.println("Это тип Double, значение " + value);
        }

        public static void print (String value){
            System.out.println("Это тип String, значение " + value);
        }

        public static void print ( short value){
            System.out.println("Это тип short, значение " + value);
        }

        public static void print (Integer value){
            System.out.println("Это тип Integer, значение " + value);
        }
    }

