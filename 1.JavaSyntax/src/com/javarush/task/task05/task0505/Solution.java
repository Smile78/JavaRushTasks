package com.javarush.task.task05.task0505;

/* 
Кошачья бойня
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Cat vask1 =new Cat("Васька", 3,4,5);
        Cat murz2 =new Cat("Мурзик", 4,4,4);
        Cat heiz3 =new Cat("Хейзи", 2,3,4);

        System.out.println("Васька мурзик "+vask1.fight(murz2));;
        System.out.println("Мурзик Хейзи "+murz2.fight(heiz3));;
        System.out.println("Хейзи Васька "+heiz3.fight(vask1));;
    }

    public static class Cat {
        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int agePlus = this.age > anotherCat.age ? 1 : 0;
            int weightPlus = this.weight > anotherCat.weight ? 1 : 0;
            int strengthPlus = this.strength > anotherCat.strength ? 1 : 0;

            int score = agePlus + weightPlus + strengthPlus;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}
