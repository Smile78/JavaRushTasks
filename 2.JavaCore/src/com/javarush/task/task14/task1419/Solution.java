package com.javarush.task.task14.task1419;

import java.io.*;
import java.net.MalformedURLException;
import java.net.ServerSocket;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
Нашествие исключений
*/

public class Solution {

    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) throws Exception {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            FileInputStream fis = null;
            fis = new FileInputStream("2.txt");
        } catch (FileNotFoundException e) {
            exceptions.add(e);
        }


//        try{
//            kalculator(23);
//        } catch (NoSuchMethodException e){
//            exceptions.add(e);
//        }
//
//        try{
//            new Print(23);
//        } catch (ClassNotFoundException e){
//            exceptions.add(e);
//        }


//        try{
//            BufferedReader inpSt = new BufferedReader(new InputStreamReader (new FileInputStream("D://2.txt" )));
//        } catch (EOFException e){
//            exceptions.add(e);
//        }

        try {
            BufferedReader inpSt = new BufferedReader(new InputStreamReader(System.in));
            inpSt.close();
            inpSt.readLine();
        } catch (IOException e) {
            exceptions.add(e);
        }
//
//       try{
//           ServerSocket sk = new ServerSocket(1234567);
//        } catch (Exception e){
//        } catch (IllegalArgumentException ??? e){

//            exceptions.add(e);
//        }


//        try  (FileInputStream fin=new FileInputStream("D://2.txt");
//              FileOutputStream fos=new FileOutputStream("D://Ro.txt"))
//        {
//            byte[] buffer = new byte[fin.available()];
//            // считываем буфер
//            fin.read(buffer, 0, buffer.length);
//            // записываем из буфера в файл
//            fos.write(buffer, 0, buffer.length);
//        }
//        catch(EOFException ex){
//
//            System.out.println(ex.getMessage());
//        }


        try {
            int[] arr = new int[3];
            System.out.println(arr[3]);

        } catch (ArrayIndexOutOfBoundsException e) {
            exceptions.add(e);
        }


        try {
            int i2 = Integer.parseInt("oue");
        } catch (NumberFormatException e) {
            exceptions.add(e);
        }

        try {
            ArrayList<String> newAL = new ArrayList<>();
            newAL.get(0);
        } catch (IndexOutOfBoundsException e) {
            exceptions.add(e);
        }

        try {
            String s = "abc";
            s.charAt(5);
        } catch (StringIndexOutOfBoundsException e) {
            exceptions.add(e);
        }

        try {
            String[] s = new String[-5];
        } catch (NegativeArraySizeException e) {
            exceptions.add(e);
        }


        try {
            Integer s = null;
            String str = Integer.toString(s);
        } catch (NullPointerException e) {
            exceptions.add(e);
        }

        try {
            URL url = new URL("");

        } catch (MalformedURLException e) {
            exceptions.add(e);
        }


        //напишите тут ваш код

    }
}
