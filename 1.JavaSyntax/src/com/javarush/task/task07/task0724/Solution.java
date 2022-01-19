package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human hmn1 = new Human("Сергей", true, 60);
        Human hmn2 = new Human("Нина", false, 60);
        Human hmn3 = new Human("Олег", true, 60);
        Human hmn4 = new Human("Елена", false, 60);
        Human hmn5 = new Human("Андрей", true, 34, hmn1,hmn2);
        Human hmn6 = new Human("Слава", true, 40,hmn1,hmn2);
        Human hmn7 = new Human("Оля", false, 30,hmn3,hmn4);
        Human hmn8 = new Human("Алеся", false, 35,hmn3,hmn4);
        Human hmn9 = new Human("Игорь", true, 30,hmn3,hmn4);

        System.out.println(hmn1);
        System.out.println(hmn2);
        System.out.println(hmn3);
        System.out.println(hmn4);
        System.out.println(hmn5);
        System.out.println(hmn6);
        System.out.println(hmn7);
        System.out.println(hmn8);
        System.out.println(hmn9);

    }

    public static class Human {
        //напишите тут ваш код

        String name;
        boolean sex ;
        int age;
        Human father;
        Human mother;

        Human(String name, boolean sex , int age){
            this.name=name;
            this.sex=sex ;
            this.age=age;
         }

         Human(String name, boolean sex , int age, Human father, Human mother){
            this.name=name;
            this.sex=sex ;
            this.age=age;
            this.father=father;
            this.mother=mother;
         }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















