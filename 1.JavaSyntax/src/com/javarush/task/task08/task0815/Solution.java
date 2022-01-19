package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String,String> hshM= new HashMap<>();
        hshM.put("Никитин", "Андрей");
        hshM.put("Засмолина", "Ольга");
        hshM.put("Никитин1", "Святослав");
        hshM.put("Засмолин", "Игорь");
        hshM.put("Засмолина1", "Алеся");
        hshM.put("Никитин2", "Сергей");
        hshM.put("Никитина", "Нина");
        hshM.put("Безмогарычный", "Александр");
        hshM.put("Герасименок", "Александр");
        hshM.put("Бурцев", "Илья");
        return hshM;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int cnt=0;
        for (String mp:map.values())
            if (mp.equals(name)) cnt++;
        return cnt;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int cnt=0;
        for (String mp:map.keySet())
            if (mp.equals(lastName)) cnt++;
        return cnt;
        }


    public static void main(String[] args) {

    }
}
