package com.javarush.task.task09.task0905;

/* 
Там, в синих глубинах стек-трейса…
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int deep = getStackTraceDeep();
//        System.out.println(deep);

    }

    public static int getStackTraceDeep() {
        //напишите тут ваш код
        StackTraceElement[] stack= Thread.currentThread().getStackTrace();
//        int i =stack.length;
//        System.out.println(i);
        return stack.length;
    }
}

