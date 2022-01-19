package netology.hw331bibl;

public class UserSupplierReaderImpl implements Reader, Supplier {


    String name;

    public UserSupplierReaderImpl(String name) {
        this.name = name;
    }


    @Override
    public void getBookToRead(Book book) {
        System.out.println("Читатель " + this.name + " взял книгу " + book.bookTitle);
    }

    @Override
    public void returnBookToLibrary(Book book) {
        System.out.println("Читатель " + this.name + " вернул книгу " + book.bookTitle);
        book.returnBookToLibrary(1);
    }


    public void shippingBookfromSuplierToLibrary(Book book, int quant) {

        System.out.println("Поставщик : " + this.name + " Вы просили " + book.qntNeed + ". Пока поставим только " + quant);
        book.addQuantityLibrary(quant);
        book.minusQuantityNeed(quant);

        System.out.println("Поставщик " + this.name + " осуществил поставку в библиотеку издания: \"" + book.bookTitle + "\"" + " в количестве: " + quant + " экземпляров");

    }


}
