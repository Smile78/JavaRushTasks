package com.javarush.task.task08.task0820;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();
        Cat cat1=new Cat();
        result.add(cat1);
        Cat cat2=new Cat();
        result.add(cat2);
        Cat cat3=new Cat();
        result.add(cat3);
        Cat cat4=new Cat();
        result.add(cat4);
        //напишите тут ваш код

        return result;
    }

    public static Set<Dog> createDogs() {
        //напишите тут ваш код
        HashSet<Dog> result = new HashSet<Dog>();

        for (int i = 0; i <3 ; i++) {
            result.add(new Dog());
        }

        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
        HashSet<Object> result = new HashSet<Object>();
        result.addAll(dogs);
        result.addAll(cats);

        return result;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
        pets.removeAll(cats);

    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код


        for ( Object  pety:pets){
            System.out.println(pety);
        }

    }

    public  static  class Dog{

    }

    public  static  class Cat{

    }

    //напишите тут ваш код
}
