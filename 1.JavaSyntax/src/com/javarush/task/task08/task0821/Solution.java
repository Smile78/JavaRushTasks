package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        Map<String,String> map = new HashMap<>();

        map.put("Никитин", "Андрей");
        map.put("Засмолина", "Ольга");
        map.put("Никитин", "Святослав");
        map.put("Засмолин", "Игорь");
        map.put("Засмолина", "Алеся");
        map.put("Никитин", "Сергей");
        map.put("Никитина", "Нина");
        map.put("Безмогарычный", "Александр");
        map.put("Герасименок", "Александр");
        map.put("Бурцев", "Илья");
        return map;


    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
