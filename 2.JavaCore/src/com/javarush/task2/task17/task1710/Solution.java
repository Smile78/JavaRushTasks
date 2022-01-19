package com.javarush.task2.task17.task1710;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/*
CRUD
CRUD - Create, Read, Update, Delete.

Программа запускается с одним из следующих наборов параметров:
-c name sex bd
-r id
-u id name sex bd
-d id

Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-c - добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран
-r - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)
-u - обновляет данные человека с данным id
-d - производит логическое удаление человека с id, заменяет все его данные на null

id соответствует индексу в списке.
Все люди должны храниться в allPeople.
Используй Locale.ENGLISH в качестве второго параметра для SimpleDateFormat.

Пример параметров:
-c Миронов м 15/04/1990

Пример вывода для параметра -r:
Миронов м 15-Apr-1990

*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
//        allPeople.add(Person.createMale("Миронов", new Date("15-Apr-1990")));  //сегодня родился    id=2
        try {
            allPeople.add(Person.createMale("Миронов", (new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH).parse("15-Apr-1990"))));  //сегодня родился    id=2
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws ParseException {
        //напишите тут ваш код

        if (args[0].equals("-c")) {
            //-c - добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран
            //-c Миронов м 15/04/1990
            if (args[2].equals("м")) {
                // если мужчина
                allPeople.add(Person.createMale(args[1], (new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[3]))));
//                    allPeople.add(Person.createMale(args[1], new  Date(args[3])));  // 3 марта 1991 ???
                System.out.println("Индекс добавленного...id (index)=" + (allPeople.size() - 1) + " ");
            }
        }

        if (args[0].equals("-r")) {
            // -r - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)
            //
            //Миронов м 15-Apr-1990
            Person pers1 = allPeople.get(Integer.parseInt(args[1]));

            System.out.println(pers1.getName() + " " + (pers1.getSex().equals(Sex.MALE)?("м"):("ж")) + " "
                    +  (new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH ).format(pers1.getBirthDate())));

        }

        if (args[0].equals("-u")) {
            //-  обновляет данные человека с данным id
            //-u id name sex bd
            //-u 2 Новичек м 12/12/2021

            Person pers2 = allPeople.get(Integer.parseInt(args[1]));
            pers2.setName(args[2]);
            pers2.setSex(args[3].equals("м")?(Sex.MALE):(Sex.FEMALE));
            pers2.setBirthDate((new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[4])));

            allPeople.set(Integer.parseInt(args[1]), pers2);

            System.out.println("id:" + args[1]+ " " + allPeople.get(Integer.parseInt(args[1])).toString());

        }

        if (args[0].equals("-d")) {
            //-d - производит логическое удаление человека с id, заменяет все его данные на null
            //-d id
            //-u 2
            // null null null

            Person pers3 = allPeople.get(Integer.parseInt(args[1]));
            pers3.setName(null);
            pers3.setSex(null);
            pers3.setBirthDate(null);

            allPeople.set(Integer.parseInt(args[1]), pers3);

            System.out.println("id:" + args[1]+ " " + allPeople.get(Integer.parseInt(args[1])).toString());

        }

//        System.out.println(allPeople.toString());


//        int ind = 0;
//        for (Person pers : allPeople) {
//            System.out.println("id:" + (ind++) + " " + pers.toString());
//        }


    }
}
