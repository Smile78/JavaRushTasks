package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;
//        User1 usr = new User1();

        //тут цикл по чтению ключей, пункт 1
        for (int i=0;; i++) {
            key = reader.readLine();

           if (key.equals("user"))      doWork(new Person.User());
         else if (key.equals("loser"))   doWork(new Person.Loser());
         else  if (key.equals("coder"))   doWork(new Person.Coder());
         else  if (key.equals("proger"))   doWork(new Person.Proger());
         else  if (key.equals("user1"))   doWork(new Person.User1());

          else   break;
            //создаем объект, пункт 2

        }
    }

    public static void doWork(Person person) {
        // пункт 3
            if (person instanceof Person.User) ((Person.User) person).live();
            if (person instanceof Person.Loser) ((Person.Loser) person).doNothing();
            if (person instanceof Person.Coder) ((Person.Coder) person).coding();
            if (person instanceof Person.Proger) ((Person.Proger) person).enjoy();
            if (person instanceof Person.User1) ((Person.User1) person).live();

    }
}
