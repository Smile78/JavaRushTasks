package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String,String> hash = new HashMap<>();
        hash.put("Никитин", "Андрей");
        hash.put("Засмолина", "Ольга");
        hash.put("Никитин1", "Святослав");
        hash.put("Засмолин", "Игорь");
        hash.put("Засмолина1", "Алеся");
        hash.put("Никитин2", "Сергей");
        hash.put("Никитина", "Нина");
        hash.put("Безмогарычный", "Александр");
        hash.put("Герасименок", "Александр");
        hash.put("Бурцев", "Илья");
        return hash;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        ArrayList<String> arrL = new ArrayList<>();

         for(Map.Entry<String, String>  mp: map.entrySet()){
             arrL.add(mp.getValue());
         }

        for (int i = 0; i < arrL.size(); i++) {
            for (int j = i+1; j < arrL.size(); j++) {
                if (arrL.get(i).equals(arrL.get(j))){
                    removeItemFromMapByValue(map,arrL.get(i));
                }
            }
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
