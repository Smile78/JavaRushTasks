package netology.hw431phonebook;

import java.util.Objects;

public class Contact {

    //Создадим класс Contact c полями: имя и номер телефона (при необходимости переоределим hashCode, equals, toString).

    String name;
    long phoneNumbr;  // protected если getNumer для phoneBook

    Contact(String name, long phoneNumbr) {
        this.name = name;
        this.phoneNumbr = phoneNumbr;
    }

    void addContact(String name, long phoneNumbr) {
        this.name = name;
        this.phoneNumbr = phoneNumbr;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return phoneNumbr == contact.phoneNumbr && Objects.equals(name, contact.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phoneNumbr);
    }

    @Override
    public String toString() {
        return "Contact{" +
                "Name='" + name + '\'' +
                ", phoneNumbr=" + phoneNumbr +
                '}';
    }

}
