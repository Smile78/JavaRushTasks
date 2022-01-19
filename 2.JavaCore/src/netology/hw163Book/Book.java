package netology.hw163Book;

public class Book {
    String title;
    Author author;
    int qntPges;
    int pubYear;
    int price;
    int libNumb;
    int rating;
    public static int totalLibNumb;

    public static int maxRating;
    public static int minRating;

    /*
    String anotation;
    String series;
    String printingHouse;
    String specialPurpose;
    String copyrights;
    String translator;
    int ISBNrus;
    int ISBNeng;
    int BBK;
    int UDK;
    int PG;
    */

    Book(String title,
         Author author,
         int qntPges,
         int pubYear,
         int price,
         int rating) {
        this.title = title;
        this.author = author;
        this.qntPges = qntPges;
        this.pubYear = pubYear;
        this.price = price;
        libNumb = totalLibNumb + 1;
        totalLibNumb++;
        this.rating = rating;
        maxRating = (maxRating == 0) ? rating : Math.max(rating, maxRating);
        minRating = (minRating == 0) ? rating : Math.min(rating, minRating);
    }

    /*
     Book(...full...){
     ...full..
     }
    */

    @Override
    public String toString() {
        return libNumb +
                ". Автор: " + author.firstName + " " + author.secondName + ", " +
                "Название книги: " + title + ", " + "\n" +
                "   " + "Издательство: " + pubYear + " год, " +
                "Цена: " + price + " руб., " +
                "Рейтинг: " + rating;
    }

    public void equalsBooks(Book extBook) {

        if (!this.title.equals(extBook.title) && !this.author.equals(extBook.author) &&
                this.qntPges != extBook.qntPges && this.pubYear != extBook.pubYear &&
                this.price != extBook.price && this.rating != extBook.rating)
            System.out.println("Данные книги: " + "\"" + this.title + "\"" + " и " + "\"" + extBook.title + "\"" + " - Это две абсолютно разные книги!");

        else if (!this.title.equals(extBook.title) || !this.author.equals(extBook.author)
                || this.qntPges != extBook.qntPges || this.pubYear != extBook.pubYear ||
                this.price != extBook.price || this.rating != extBook.rating) {
            System.out.println("\n" + "Обнаружены расхождения в книгах: " + "\"" + this.title + "\"" + " и " + "\"" + extBook.title + "\"");
            System.out.print("В них не совпадают: ");
            if (!this.title.equals(extBook.title)) System.out.print("Названия. ");
            if (!this.author.equals(extBook.author)) System.out.print("Авторы. ");
            if (this.qntPges != extBook.qntPges) System.out.print("Кол-во страниц. ");
            if (this.pubYear != extBook.pubYear) System.out.print("Годы издания. ");
            if (this.price != extBook.price) System.out.print("Цены. ");
            if (this.rating != extBook.rating) System.out.print("Рейтинги. ");
        } else
            System.out.println("Данные книги: " + "\"" + this.title + "\"" + " и " + "\"" + extBook.title + "\"" + " - Полностью совпадают!");
    }

}
