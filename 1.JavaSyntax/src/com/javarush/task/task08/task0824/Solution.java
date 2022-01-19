package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.Random;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код


           ArrayList<Human> childs= new ArrayList<>();
        childs.add( new Human("Андрей",true ,34));
        childs.add( new Human("Слава",true ,40));
        childs.add( new Human("Оля",false ,30));



        ArrayList<Human> parents1= new ArrayList<>();
        ArrayList<Human> parents2= new ArrayList<>();
            parents1.add(new Human("папа Сергей",true ,65, childs));
            parents2.add(new Human("мама Нина",false,64, childs));


        ArrayList<Human> grandParents= new ArrayList<>();
              grandParents.add(new Human("дед Степан",true ,85, parents1 ));
              grandParents.add(new Human("дед Николай",true ,85, parents2));
              grandParents.add(new Human("бабуля Ольга",false,84, parents1));
              grandParents.add(new Human("бабуля Антонина",false,84, parents2));

        for(Human gP: grandParents) {
            System.out.println(gP);
        }

        for(Human p1: parents1) {
            System.out.println(p1);
        }
        for(Human p2: parents2) {
            System.out.println(p2);
        }


        for(Human ch: childs) {
            System.out.println(ch);
        }



    }

    public static class Human {
        //напишите тут ваш код
         String name;
         boolean sex;
            int age;
        ArrayList<Human> children= new ArrayList<>();;



        Human(String name, boolean sex,int age, ArrayList<Human> children ){
            this.name=name;
            this.sex=sex;
            this.age=age;
            this.children=children;
        }



        Human(String name, boolean sex,int age ){
            this.name=name;
            this.sex=sex;
            this.age=age;

        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;



        }
    }

}
