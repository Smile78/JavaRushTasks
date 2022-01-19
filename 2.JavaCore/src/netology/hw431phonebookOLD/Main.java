package netology.hw431phonebookOLD;

//HashMap, HashSet

//Создадим класс PhoneBook, в котором будем хранить все созданные группы.
//В классе PhoneBook создадим HashMap: ключом для этой коллекции будет название группы, а значением — список контактов (List<Contact>).
//Создадим класс Contact c полями: имя и номер телефона (при необходимости переоределим hashCode, equals, toString).
//Создадим методы для добавления группы и контакта в группы в классе PhoneBook.

//Для демонстрации работы программы в коде создадим несколько контактов и добавим их в несколько групп.


//Создание группы контактов;
//Создание контакта;
//Добавление контакта в разные группы;
//Поиск контакта по номеру.

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<Contact> set = new HashSet<>();

        PhoneBook phnb1 = new PhoneBook();

        Contact cont1 = new Contact("Olga_work_",79210933548L);
        Contact cont2_me = new Contact("Andrew_all",79219638383L);
        Contact cont2_nm = new Contact("Andrew_all",79219638383L); //full copy !!!! сказали нельзя в одной группе...??
        Contact cont3 = new Contact("Serg_motoc",79210567567L);
        Contact cont4 = new Contact("Slava_flit",79211424346L);
        Contact cont5 = new Contact("XXX_noansw",79039234787L);


        phnb1.addContact2group(GroupName.Work, cont1);
        phnb1.addContact2group(GroupName.Work, cont2_me);
        phnb1.addContact2group(GroupName.Work, cont2_nm);

        phnb1.addContact2group(GroupName.Motocross, cont2_me);
        phnb1.addContact2group(GroupName.Motocross, cont3);

        phnb1.addContact2group(GroupName.Planes, cont2_me);

        phnb1.addContact2group(GroupName.Banned, cont5);


        phnb1.printGroup(GroupName.Work);
        phnb1.printGroup(GroupName.Motocross);
        phnb1.printGroup(GroupName.Planes);
        phnb1.printGroup(GroupName.Banned);


        //эмуляция поиска контакта по номеру
        System.out.println(("=").repeat(35));
        System.out.println("...поиск по группам...");
        phnb1.searchContact(79219638383L);


    }
}
