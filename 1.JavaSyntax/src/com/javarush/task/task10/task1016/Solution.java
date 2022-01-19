package com.javarush.task.task10.task1016;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Одинаковые слова в списке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
            for (int i = 0; i < 5; i++) {
                words.add(reader.readLine());
            }

        Map<String, Integer> map = countWords(words);


        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }


    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();


                for (int i = 0; i <list.size() ; i++) {
                        if (result.containsKey(list.get(i))){
                                for(Map.Entry rst:result.entrySet()){
                                    if(rst.getKey().equals(list.get(i))){
                                        int ind =(int)rst.getValue();
                                         ind++;
                                         rst.setValue(ind);
                                    }
                                }
                        } else result.put(list.get(i),1);
                }


        //напишите тут ваш код


        return result;
    }

}

