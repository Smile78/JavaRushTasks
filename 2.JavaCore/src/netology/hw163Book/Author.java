package netology.hw163Book;

import java.util.ArrayList;

public class Author {
    String firstName;
    String secondName;
    int birthYear;
    int nmbAuthor;
    public static int totalQntAuth;
    ArrayList<Book>  books;

    Author(String firstName, String secondName, int birthYear ){
        this.firstName=firstName;
        this.secondName =secondName;
        this.birthYear =birthYear;
        nmbAuthor=totalQntAuth+1;
        totalQntAuth++;

        books=new ArrayList<>();
    }

    public void addBook2Author(Book book){
        books.add(book);
    }

    @Override
    public String toString() {
        return  nmbAuthor+ ". " +
                firstName+" " +secondName+" "+
                "(" +
                ((birthYear==0000)? "неизвестный":birthYear)  +
                " г.р.)"+
                " доcтупных книг: "+ books.size()+
                " " ;
    }
}
