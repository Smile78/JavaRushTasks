package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Cat tomCat= new Cat("Tom", 60, "blue");
        Dog  dogPit= new Dog("Pit", 80, "gray");

        //напишите тут ваш код
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Cat {
        String name;
        int height;
        String color;

        public Cat(String name, int height, String color) {
            this.name = name;
            this.height = height;
            this.color= color;
        }
    }

    public static class Dog {
        String name;
        int height;
        String color;

        public Dog(String name, int height, String color) {
            this.name = name;
            this.height = height;
            this.color= color;
        }
    }

    //напишите тут ваш код
}
