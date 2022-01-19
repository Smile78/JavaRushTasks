package netology.hw163Book;

public class User {

    String email;
    String name;
    String surname;
    Book book;
    int usrNmbr;
    public static int totalUserCnt;

    User(String email,
         String name,
         String surname,
         Book book) {
        this.email = email;
        this.name = name;
        this.surname = surname;
        this.book = book;
        usrNmbr = totalUserCnt + 1;
        totalUserCnt++;
    }

    @Override
    public String toString() {
        return usrNmbr + ". " +
                name + " " + surname + " - " +
                "email: " + email +
                " читает: " + book.title;

    }
}
