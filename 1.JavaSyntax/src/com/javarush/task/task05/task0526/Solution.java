package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код


        Man man1=new Man("Андрей", 34, "Komend 40");
        Man man2=new Man("Слава", 40, "Шуви 4");

        Woman wumn1=new Woman("Оля", 30, "Шуви 72");
        Woman wumn2=new Woman("Юля", 34, "Ленина 24");

        System.out.println(man1.name+" "+man1.age+" " +man1.address);
        System.out.println(man2.name+" " +man2.age+" " +man2.address);

        System.out.println(wumn1.name+" " +wumn1.age+" " +wumn1.address);
        System.out.println(wumn2.name+" " +wumn2.age+" " +wumn2.address);

    }

    //напишите тут ваш код
    public static class Man{
        String name;
        int age;
        String address;

        public Man(String name, int age, String address){
            this.name=name;
            this.age=age;
            this.address=address;
        }
    }
    public static class Woman{
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address){
            this.name=name;
            this.age=age;
            this.address=address;
        }
    }
}
