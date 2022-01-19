package com.javarush.task.task08.task0818;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код

        HashMap<String,Integer> hash = new HashMap<>();
        hash.put("Никитин", 1000 );
        hash.put("Засмолина", 3000);
        hash.put("Никитин1", 400);
        hash.put("Засмолин", 300);
        hash.put("Засмолина1", 8000);
        hash.put("Никитин2", 700);
        hash.put("Никитина", 200);
        hash.put("Безмогарычный", 5000);
        hash.put("Герасименок", 3000);
        hash.put("Бурцев", 1000);
        return hash;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код

        HashMap<String, Integer> copy = new HashMap<String, Integer>(map);

        for (Map.Entry<String, Integer> pair : copy.entrySet()) {
            if (pair.getValue()<500)
                map.remove(pair.getKey());
        }
    }


    public static void main(String[] args) {

    }
}