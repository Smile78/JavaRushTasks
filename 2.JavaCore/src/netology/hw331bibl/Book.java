package netology.hw331bibl;

public class Book {

    String bookTitle;
    String bookAuthor;
    int qntNeed;
    int qntLibrary;

    Book(String bookTitle, String bookAuthor) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        qntNeed = 0;
        qntLibrary = 0;


    }

    void addQntityNeed(int quant) {
        this.qntNeed += quant;

    }

    void addQuantityLibrary(int quant) {
        this.qntLibrary += quant;
        this.qntNeed -= quant;
    }

    void minusQuantityNeed(int quant) {
        this.qntNeed -= quant;
    }


    void getBookFromLibrary(int quant) {
        this.qntLibrary -= quant;
    }

    void returnBookToLibrary(int quant) {
        this.qntLibrary += quant;
    }


}
