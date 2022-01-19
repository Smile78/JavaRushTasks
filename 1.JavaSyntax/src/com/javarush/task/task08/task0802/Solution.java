package com.javarush.task.task08.task0802;

/* 
HashMap из 10 пар
*/


import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        HashMap<String,String> hshMap = new HashMap<String,String>();

        hshMap.put("арбуз", "ягода");
        hshMap.put("банан", "трава");
        hshMap.put("вишня","ягода");
        hshMap.put("груша","фрукт");
        hshMap.put("дыня","овощь");
        hshMap.put("ежевика","куст");
        hshMap.put("женьшень","корень");
        hshMap.put("земляника","ягода");
        hshMap.put("ирис","цветок");
        hshMap.put("картофель","клубень");

        for (Map.Entry ent:hshMap.entrySet()){
            System.out.println(ent.getKey()+" - "+ent.getValue());
        }


    }
}
