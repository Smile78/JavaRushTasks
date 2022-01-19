package netology.hw431phonebookOLD;

import java.util.Objects;

public class Contact {

    String name;
    long phoneNumbr;

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
