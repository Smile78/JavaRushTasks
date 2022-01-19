package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> mp = new HashMap<>();

        while(true) {
            String id = reader.readLine();
            if ( id.isEmpty()) break;
            String name = reader.readLine();
                if ( name.isEmpty())  {
                    mp.put("", Integer.parseInt(id));
                    break;}

                mp.put(name, Integer.parseInt(id));

        }

        for(Map.Entry mapa:mp.entrySet()){
            System.out.println(mapa.getValue()+" " +mapa.getKey() );
        }


//        System.out.println("Id=" + id + " Name=" + name);
    }
}
