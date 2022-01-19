package com.javarush.task.task06.task0614;

import java.sql.SQLOutput;
import java.util.ArrayList;

/* 
Статические коты
*/

public class Cat {
    //напишите тут ваш код
    public static  ArrayList<Cat>  cats =new ArrayList<Cat>();
    String name;

    public Cat( String name) {
        this.name= name;
        cats.add(this);
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        Cat[] cat = new Cat[10];

        for (int i = 0; i <10; i++) {

            cat[i] = new Cat("Cat_"+i);
//           cats.add(cat[i]);
        }

        printCats();
    }

    public static void printCats() {
        //напишите тут ваш код

        for (int i = 0; i < cats.size(); i++) {
            System.out.println(cats.get(i));
        }

    }
}
