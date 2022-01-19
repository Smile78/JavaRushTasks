package com.javarush.task.task09.task0901;

/* 
Возвращаем StackTrace
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        StackTraceElement[] stack1   = method1() ;

        System.out.println("first  "+stack1.length );


    }

    public static StackTraceElement[] method1() {
        method2();
        StackTraceElement[] stack   = Thread.currentThread().getStackTrace();
        //напишите тут ваш код

        for (StackTraceElement element: stack)
        {   System.out.println("1: "+element.getMethodName()); }
        System.out.println("1 stack.length: "+stack.length);

        return stack ;
    }

    public static StackTraceElement[] method2() {
        method3();
         StackTraceElement[] stack  = Thread.currentThread().getStackTrace();
        //напишите тут ваш код
        return stack ;
    }

    public static StackTraceElement[] method3() {
        method4();
         StackTraceElement[] stack  = Thread.currentThread().getStackTrace();
        //напишите тут ваш код
        return stack ;
    }

    public static StackTraceElement[] method4() {
        method5();
         StackTraceElement[] stack  = Thread.currentThread().getStackTrace();
        //напишите тут ваш код
        return stack ;
    }

    public static StackTraceElement[] method5() {
      StackTraceElement[] stack  =Thread.currentThread().getStackTrace();
        //напишите тут ваш код
        for (StackTraceElement element: stack)
        {   System.out.println("5: "+element.getMethodName()); }
        System.out.println("5 stack.length: "+stack.length);

        System.out.println("wy");

        return stack ;
    }
}
