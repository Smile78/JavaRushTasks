package netology.hw431phonebook;


//HashMap, HashSet

//Создадим класс PhoneBook, в котором будем хранить все созданные группы.
//В классе PhoneBook создадим HashMap: ключом для этой коллекции будет название группы, а значением — список контактов (List<Contact>).
//Создадим класс Contact c полями: имя и номер телефона (при необходимости переоределим hashCode, equals, toString).
//Создадим методы для добавления группы и контакта в группы в классе PhoneBook.

//Для демонстрации работы программы в коде создадим несколько контактов и добавим их в несколько групп.


//Создание группы контактов;            --- enum
//Создание контакта;                    ---?
//Добавление контакта в разные группы;  +-
//Поиск контакта по номеру.             +


public class Main {

    public static void main(String[] args) {

        PhoneBook phnb1 = new PhoneBook();

        //добавляем контакты
        phnb1.addContact2groupAll("Olga_work_", 79210933111L);
        phnb1.addContact2groupAll("Andrew_all", 79219638222L);
        phnb1.addContact2groupAll("Andrew_all", 79219638222L); // этот не добавится хехе
        phnb1.addContact2groupAll("Serg_motoc", 79210567333L);
        phnb1.addContact2groupAll("Slava_flit", 79211424444L);
        phnb1.addContact2groupAll("XXX_noansw", 79039234555L);

        phnb1.printGroup(GroupName.ALL);

        // добавляем контакты в группы
        phnb1.addContact2group(GroupName.WORK, "Olga_work_");
        phnb1.addContact2group(GroupName.WORK, "Olga_work_new");  // не добавится
        phnb1.addContact2group(GroupName.WORK, "Andrew_all");
        phnb1.addContact2group(GroupName.WORK, "Andrew_all");     // этот не добавится хехе
        phnb1.addContact2group(GroupName.MOTOCROSS, "Andrew_all");
        phnb1.addContact2group(GroupName.MOTOCROSS, "Serg_motoc");
        phnb1.addContact2group(GroupName.PLANES, "Andrew_all");
        phnb1.addContact2group(GroupName.BANNED, "XXX_noansw");

        //распечатка каждой группы
        phnb1.printGroup(GroupName.WORK);
        phnb1.printGroup(GroupName.MOTOCROSS);
        phnb1.printGroup(GroupName.PLANES);
        phnb1.printGroup(GroupName.BANNED);

        //поиск контакта по номеру
        System.out.println(("=").repeat(35));
        System.out.println("...поиск по группам...");
        phnb1.searchContact(79219638222L);

    }
}
