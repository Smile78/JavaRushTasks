package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static{
        labels.put(1.4,"Fak1");
        labels.put(2.4,"Fak2");
        labels.put(3.4,"Fak3");
        labels.put(4.4,"Fak4");
        labels.put(5.4,"Fak5");
    }
    public static void main(String[] args) {
        System.out.println(labels);
    }


}
