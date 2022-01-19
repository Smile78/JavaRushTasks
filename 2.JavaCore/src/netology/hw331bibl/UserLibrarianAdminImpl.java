package netology.hw331bibl;

public class UserLibrarianAdminImpl implements Librarian, Administrator {

    String name;

    public UserLibrarianAdminImpl(String name) {
        this.name = name;
    }

    @Override
    public void giveout(Book book, Reader readr) {

    }

    public void giveout(Book book, UserSupplierReaderImpl readr) {
        System.out.println("Администратор " + this.name + " выдал книгу " + book.bookTitle);
        readr.getBookToRead(book);
        book.getBookFromLibrary(1);

    }


    @Override
    public void overdueNotification(Reader reader, Book book) {
        //

    }

    public void overdueNotification(UserSupplierReaderImpl reader, Book book, int dayzOver) {
        System.out.println("Оо! Уважаемый: " + reader.name + " у Вас превышен срок сдачи книги : \"" + book.bookTitle + "\" на " + dayzOver + " дней");

    }


    @Override
    public void orderBook(Book book, Supplier supl, int quant) {

    }

    public void orderBook(Book book, UserSupplierReaderImpl supl, int quant) {
        System.out.println("Библиотекарь " + this.name + " заказал издание \"" + book.bookTitle + "\" у поставщика " + supl.name + " в количестве " + quant);
        book.addQntityNeed(quant);

    }


}
