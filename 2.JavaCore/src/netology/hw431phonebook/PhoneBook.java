package netology.hw431phonebook;


import java.util.*;

//В классе PhoneBook создадим HashMap: ключом для этой коллекции будет название группы, а значением — список контактов (List<Contact>).
//Создадим методы для добавления группы и контакта в группы в классе PhoneBook.


public class PhoneBook {

    protected Map<GroupName, List<Contact>> phoneBook;

    PhoneBook() {
        phoneBook = new HashMap<>();
    }


    public void addContact2groupAll(String name, long phnoneNumber) {
        List<Contact> listAll;
        if (!phoneBook.containsKey(GroupName.ALL)) {        //если еще пустая группа
            listAll = new ArrayList<>();
            listAll.add(new Contact(name, phnoneNumber));
            phoneBook.put(GroupName.ALL, listAll);
        } else {
            listAll = phoneBook.get(GroupName.ALL);

            boolean was = false;
            for (Contact listIter : listAll) {
                if (listIter.name.equals(name) && listIter.phoneNumbr == phnoneNumber) {
                    System.out.println("Контакт " + name + " " + phnoneNumber + "...Такой уже есть в общей группе");
                    was = true;
                }
            }

            if (!was) {
                listAll.add(new Contact(name, phnoneNumber));
                phoneBook.remove(GroupName.ALL);    //вот такой вот вариант
                phoneBook.put(GroupName.ALL, listAll);
            }
        }
    }

    void addContact2group(GroupName group, String name) {
        Contact contWasALL = null;
        for (Contact contWasIter : phoneBook.get(GroupName.ALL)) {
            if (contWasIter.name.equals(name))
                contWasALL = contWasIter;                    // есть такой контакт в Общей группе
        }

        if (contWasALL == null)
            System.out.println("Создайте контакт с таким именем:  " + name + " - Такого контакта пока еще нет!!!");
        else {

            if (!phoneBook.containsKey(group)) {                                             // если еще пока нет такой групы в книге
                List<Contact> listNewGroup = new ArrayList<>();
                listNewGroup.add(contWasALL);
                phoneBook.put(group, listNewGroup);
            } else {
                List<Contact> listOldGroup = phoneBook.get(group);                            // если уже есть группа
                boolean was = false;
                for (Contact contactIter : listOldGroup) {
                    if (contactIter.name.equals(contWasALL.name) && contactIter.phoneNumbr == contWasALL.phoneNumbr) {
                        was = true;                                                          // типо если уже было то не будем добавлять
                        System.out.println("Контакт " + name + " " + contactIter.phoneNumbr + "...Такой уже есть в данной группе");
                    }
                }

                if (!was) {
                    listOldGroup.add(contWasALL);                                           //если еще не было в группе добавим из Общей группы
                    phoneBook.put(group, listOldGroup);
                }
            }
        }


    }

    void printGroup(GroupName group) {
        System.out.println(("=").repeat(25));
        System.out.println("Group: " + group);

        List<Contact> list1 = phoneBook.get(group);                //
        for (Contact cnt : list1) {                              // O(n)  - но тут все равно всю печатать!!
            System.out.println(cnt);
        }
    }

    void searchContact(long number) {
        System.out.println(("==").repeat(13));
        System.out.println("пробиваем контакт " + number);

        for (Map.Entry<GroupName, List<Contact>> entry1 : phoneBook.entrySet()) {       //может сделать хэшмап(контак.имя, контакт.тел) каждой группы для более быстрого поиска?
            for (Contact list : entry1.getValue()) {
                if (list.phoneNumbr == number) {
                    System.out.println(list + " группа: " + entry1.getKey());
                }
            }
        }
    }
}
