package netology.hw331bibl;

// – берет
// и возвращает книги.
// читатель берет книги у администратора

public interface Reader {

    void getBookToRead(Book book);

    void returnBookToLibrary(Book book);


}
