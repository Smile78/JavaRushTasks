package com.javarush.task.task10.task1013;

/*
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
        private String name;
        private int age;
        private boolean sex;
        private String adress;
        private int salary;
        private boolean aherizm;

       public  Human(String name,   int age,  boolean sex,  String adress,  int salary, boolean aherizm){
            this.name=name;
            this.age=age;
            this.sex=sex;
            this.adress=adress;
            this.salary=salary;
            this.aherizm=aherizm;
        }
        public Human(String name,     boolean sex,  String adress,  int salary, boolean aherizm){
            this.name=name;

            this.sex=sex;
            this.adress=adress;
            this.salary=salary;
            this.aherizm=aherizm;
        }

        public Human(String name,   int age,   String adress,  int salary, boolean aherizm){
            this.name=name;
            this.age=age;

            this.adress=adress;
            this.salary=salary;
            this.aherizm=aherizm;
        }

        public Human(String name,   int age,  boolean sex,  String adress,   boolean aherizm){
            this.name=name;
            this.age=age;
            this.sex=sex;
            this.adress=adress;
            this.aherizm=aherizm;
        }

        public Human(String name,   int age,  boolean sex,   int salary, boolean aherizm){
            this.name=name;
            this.age=age;
            this.sex=sex;

            this.salary=salary;
            this.aherizm=aherizm;
        }



        public Human(String name,   int age,  boolean sex,  String adress,  int salary ){
            this.name=name;
            this.age=age;
            this.sex=sex;
            this.adress=adress;
            this.salary=salary;
        }
        public Human(String name,   int age,  boolean sex,  String adress){
            this.name=name;
            this.age=age;
            this.sex=sex;
            this.adress=adress;
        }
         public Human(String name,   int age,  boolean sex ){
            this.name=name;
            this.age=age;
            this.sex=sex;
        }
         public Human(String name,   int age ){
            this.name=name;
            this.age=age;
        }
         public Human(String name  ){
            this.name=name;
        }

    }
}
