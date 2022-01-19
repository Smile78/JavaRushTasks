package netology.hw331bibl;

import java.util.ArrayList;
import java.util.List;

public class Library {

    List<Book> library ;

    Library(){
        library = new ArrayList<Book>();
    }

    void addbookToLibrary(Book book){
         library.add(book);
    }





}
