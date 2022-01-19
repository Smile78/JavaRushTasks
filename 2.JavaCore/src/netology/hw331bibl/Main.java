package netology.hw331bibl;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        //создайте 2-3 объекта, реализующих эти интерфейсы.

        // интерфейсов у пользователя (User) может быть несколько.
        // Объекты класса User могут взаимодействовать друг с другом
        // **(например, библиотекарь заказывает у поставщика

        //
        //  продемонстрируйте совмещение,
        // ** поставщик, который может быть также и читателем
        // ** библиотекарь – администратором и т.д

        // В качестве реализации методов можно сделать вывод подробного сообщения в консоль по типу
        // "Библиотекарь Вася заказал у поставщика Петя книгу Игра Престолов".

        UserLibrarianAdminImpl usrLibAdm1 = new UserLibrarianAdminImpl("Vasya");
        UserSupplierReaderImpl usrSuplRdr = new UserSupplierReaderImpl("Petya");
//        List<Book> library = new ArrayList<Book>();
        Book book1 = new Book("Game of the trones", "Djorj Martin");
//        library.add(book1);

        usrLibAdm1.orderBook(book1, usrSuplRdr, 6);

        usrSuplRdr.shippingBookfromSuplierToLibrary(book1, 5);
        System.out.println("Наличие в библиотеке издания: " + "\"" + book1.bookTitle + "\"" + " в количестве " + book1.qntLibrary + " шт.");


        usrLibAdm1.giveout(book1, usrSuplRdr);
        System.out.println("Наличие в библиотеке издания: " + "\"" + book1.bookTitle + "\"" + " в количестве " + book1.qntLibrary + " шт.");

        usrLibAdm1.overdueNotification(usrSuplRdr, book1, 3);

        usrSuplRdr.returnBookToLibrary(book1);
        System.out.println("Наличие в библиотеке издания: " + "\"" + book1.bookTitle + "\"" + " в количестве " + book1.qntLibrary + " шт.");
//


    }


}
