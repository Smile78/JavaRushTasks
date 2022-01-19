package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //напишите тут ваш код. step 3 - пункт 3
            Iterator<Cat> it = cats.iterator();
            it.next();
            it.remove();

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2

        Set<Cat>  cats= new HashSet<Cat>(3);

         Cat   cat1= new  Cat ();
            cats.add(cat1);
            Cat   cat2= new  Cat ();
            cats.add(cat2);
            Cat   cat3= new  Cat ();
            cats.add(cat3);
            Cat   cat4= new  Cat ();
            cats.add(cat4);

        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4

        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }

    // step 1 - пункт 1
    public static class Cat{


    }
}
