package netology.hw431phonebookOLD;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//В классе PhoneBook создадим HashMap: ключом для этой коллекции будет название группы, а значением — список контактов (List<Contact>).
//Создадим методы для добавления группы и контакта в группы в классе PhoneBook.


public class PhoneBook {

    protected HashMap<GroupName, List<Contact>> phoneBook;
//    protected static List<Contact> contactList;                // просто лист контактов чтобы не было дубликатов (без груп итд)

    PhoneBook() {
        phoneBook = new HashMap<>();
//        contactList = new ArrayList<>();
    }

    void addContact2group(GroupName group, Contact cont) {

        if (!phoneBook.containsKey(group)) {                                    //если еще пока нет такой групы в книге
            List<Contact> list = new ArrayList<>();
            list.add(cont);
            phoneBook.put(group, list);

        } else {
            List<GroupName> gr1 = searchContact(cont.phoneNumbr);
            int cnt=0;
            for (GroupName gr2: gr1 ) {
                if (gr2.equals(group)){
                    System.out.println("Такой контакт уже есть в это группе. сорри вери биг");
                    cnt++;
                }
            }
                    if (cnt<2) {
                        List<Contact> list2 = new ArrayList<>((phoneBook.get(group)));        //если уже есть группа - сделаем копию всего листа из прошлой групы и потом добавим в этот новый лист и потом добавим этот новый лист в тел книгу :(
                        list2.add(cont);
                        phoneBook.put(group, list2);
                    }

        }
    }

    void printGroup(GroupName group) {
        System.out.println(("=").repeat(25));
        System.out.println("Group: " + group);
        List<Contact> list = new ArrayList<>((phoneBook.get(group)));
        for (Contact cnt : list) {
            System.out.println(cnt);
        }
    }

    List<GroupName> searchContact(long number) {
//      void searchContact(long number) {
        List<GroupName> listGr = new ArrayList<>();

        System.out.println(("==").repeat(13));
        System.out.println("пробиваем контакт "+ number);

        for (Map.Entry<GroupName, List<Contact>> entry1 : phoneBook.entrySet()) {

            GroupName en = entry1.getKey();

            for (Contact list: entry1.getValue()) {
                if (list.phoneNumbr == number) {
                    System.out.println(list +" группа: "+en);
                    listGr.add(en);
                }
            }
        }
//          System.out.println(listGr.toString());  - чек серч групс инсерт

        //****************
        System.out.println("2ой варик пробивки на List :)");
//        for (Map.Entry<GroupName, List<Contact>> listC:phoneBook.entrySet() ) {}
        List<List<Contact>> list = new ArrayList<>(phoneBook.values());
       
        for (List<Contact> list2 : list) {
            GroupName en = null;
            for (Map.Entry<GroupName, List<Contact>> entry1 : phoneBook.entrySet()) {
                if(entry1.getValue().equals(list2))   en= entry1.getKey();
            }
            for (Contact cont : list2) {
                if (cont.phoneNumbr == number) {
//                    System.out.println(cont+phoneBook.getKey()); // wtf wy no getKey
                    System.out.println(cont+" группа: "+en);

                }
            }
        }

        return listGr;
    }
}
