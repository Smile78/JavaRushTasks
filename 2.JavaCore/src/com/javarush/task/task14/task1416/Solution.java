package com.javarush.task.task14.task1416;

/* 
Исправление ошибок
*/

public class Solution {
    public static void main(String[] args) {
        Swimmable animal = new Orca();
        animal.swim();
        animal = new Whale();
        animal.swim();
        animal = new Otter();
        animal.swim();
    }

    public static void test(Swimmable animal) {
        animal.swim();
    }

    interface Walkable {
        void walk();
    }

    interface Swimmable {
        void swim();
    }

    static abstract class OceanAnimal implements Swimmable {
        public void swim() {
            OceanAnimal currentAnimal = (OceanAnimal) getCurrentAnimal();
            currentAnimal.swimming();
        }

        private void swimming()  {
            System.out.println(getCurrentAnimal().getClass().getSimpleName() + " is swimming");
        }

        abstract Swimmable getCurrentAnimal();
    }

    static class Orca  extends OceanAnimal  {

        @Override
        Swimmable getCurrentAnimal() {
            return new Orca();
        }
    }

    static class Whale  extends OceanAnimal {

        @Override
        Swimmable getCurrentAnimal() {
            return new Whale();
        }
    }

    static class Otter   implements Swimmable, Walkable{


        @Override
        public void walk() {

        }

        @Override
        public void swim() {
            Otter currentAnimal = (Otter) getCurrentAnimal();
            currentAnimal.swimming();
        }

        private void swimming()  {
            System.out.println(getCurrentAnimal().getClass().getSimpleName() + " is walking and swimming");
        }

        Swimmable getCurrentAnimal() {
            return new Otter();
        }

    }
}
