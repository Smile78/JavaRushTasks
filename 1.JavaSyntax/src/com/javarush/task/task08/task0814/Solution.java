package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        //напишите тут ваш код
        Set<Integer> set= new HashSet<>();
        for (int i = 0; i <20 ; i++) {
            set.add(i);
        }
    return (HashSet)set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        //напишите тут ваш код
        Iterator<Integer> iter = set.iterator();
        while(iter.hasNext()){
            Integer chs=iter.next();
                if (chs>10) iter.remove();
        }
        return (HashSet)set;
    }

    public static void main(String[] args) {

    }
}
