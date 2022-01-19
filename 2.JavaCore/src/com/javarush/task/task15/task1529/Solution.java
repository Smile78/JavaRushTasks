package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args)  {

    }
    
    static {
        //add your code here - добавьте код тут

                reset();
    }

    public static CanFly result;

    public static void reset() {
        //add your code here - добавьте код тут
        try{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String str =buf.readLine();
         if (str.equals("helicopter"))  result = new Helicopter();
         if (str.equals("plane")) {
             int kol =Integer.parseInt(buf.readLine());
             result = new Plane(kol);
             buf.close();
         }


        }
        catch (IOException e){
            System.out.println("s");
        }

    }
}
