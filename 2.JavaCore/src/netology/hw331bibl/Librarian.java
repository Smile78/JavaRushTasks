package netology.hw331bibl;

//  заказывает книги.
//  библиотекарь заказывает у поставщика и т.д.

public interface Librarian {

    void orderBook(Book book, Supplier supl, int quant);

}
