package com.javarush.task.task08.task0819;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Set;

/*
Set из котов
*/

public class Solution1 {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //напишите тут ваш код. step 3 - пункт 3
            cats.remove(0);
        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2
        Set cats = new HashSet();
        cats.add(new Cat("Мур"));
        cats.add(new Cat("Мяу"));
        cats.add(new Cat("Гав"));
        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
        for (Cat cats1:cats) {
            System.out.println(cats1);
        }

    }

    // step 1 - пункт 1
    public static class Cat {
        String name;
        Cat(String name){
            this.name=name;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}
