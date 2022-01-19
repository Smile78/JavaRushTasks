package netology.hw331bibl;

// находит и выдает книги
// и уведомляет о просрочках времени возврата.

public interface Administrator {


    void giveout(Book book, Reader redr);

    void overdueNotification(Reader reader, Book book);


}
