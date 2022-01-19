package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Закрепляем паттерн Singleton
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;
    //add static block here - добавьте статический блок тут

    static {
//        Solution.readKeyFromConsoleAndInitPlanet();
         readKeyFromConsoleAndInitPlanet();
    }

    public static void readKeyFromConsoleAndInitPlanet() {
        // implement step #5 here - реализуйте задание №5 тут
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
         try {
             String inp = buf.readLine();
             buf.close();
//             if (inp.equals(Planet.SUN)||inp.equals(Planet.MOON)||inp.equals(Planet.EARTH)){
                 if (inp.equals(Planet.SUN)) thePlanet = Sun.getInstance();
                 else if (inp.equals(Planet.MOON)) thePlanet = Moon.getInstance();
                 else if (inp.equals(Planet.EARTH)) thePlanet =  Earth.getInstance();
//             }
//            Planet thePlanet=null;
              else thePlanet=null;

         } catch (IOException e){
             System.out.println("Hz");
         }



    }
}
