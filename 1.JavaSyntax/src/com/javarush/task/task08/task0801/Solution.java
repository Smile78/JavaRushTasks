package com.javarush.task.task08.task0801;

/* 
HashSet из растений
*/

import java.util.HashSet;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        HashSet<String> hash = new HashSet<String>();
        hash.add("арбуз");
        hash.add("банан");
        hash.add("вишня");
        hash.add("груша");
        hash.add("дыня");
        hash.add("ежевика");
        hash.add("женьшень");
        hash.add("земляника");
        hash.add("ирис");
        hash.add("картофель");

        for (String hsh:hash ) {
            System.out.println(hsh);
        }

    }
}
