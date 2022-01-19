package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
//        List<String> addresses = new ArrayList<String>();
        HashMap<String,String> famCity = new HashMap<>();

        while (true) {
            String city = reader.readLine();

            if (city.isEmpty() ) break;
            String family = reader.readLine();
            famCity.put(city,family);

        }

        String city1 = reader.readLine();
        System.out.println(famCity.get(city1));



        //read home number
//        int houseNumber = Integer.parseInt(reader.readLine());
//
//        if (0 <= houseNumber && houseNumber < addresses.size()) {
//            String familySecondName = addresses.get(houseNumber);
//            System.out.println(familySecondName);
//        }
    }
}
