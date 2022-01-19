package com.javarush.task.task06.task0613;

/*
Кот и статика
*/

public class Solution1 {
    public static void main(String[] args) {
        // Создай 10 котов
            Cat murzik = new Cat();
        System.out.println(Cat.catCount);
        // Выведи значение переменной catCount
    }

    public static class Cat {
        // Создай статическую переменную catCount
        public static int catCount ;

        Cat(){
            catCount++;
        }
        // Создай конструктор
    }
}
