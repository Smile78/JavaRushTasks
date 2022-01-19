package com.javarush.task.task09.task0902;

/* 
И снова StackTrace
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static String method1() {
        method2();
        //напишите тут ваш код
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();

        return stack[2].getMethodName();
    }

    public static String method2() {
        method3();
        //напишите тут ваш код
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();

        return stack[2].getMethodName();
    }

    public static String method3() {
        method4();
        //напишите тут ваш код
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        System.out.println("3 :" +stack[2].getMethodName());
        return stack[2].getMethodName();
    }

    public static String method4() {
        method5();
        //напишите тут ваш код
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();

        return stack[2].getMethodName();
    }

    public static String method5() {
        //напишите тут ваш код
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
//        for(StackTraceElement e : stack){
//              System.out.println(e.getMethodName());
//        }

        System.out.println("5 сам1:"    +stack[1].getMethodName());
        System.out.println("5 вызвал2 :" +stack[2].getMethodName());
        return stack[2].getMethodName();
    }
}
