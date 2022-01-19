package netology.hw161BookKri;

public class Book {
    String name;
    int pages;
    int rating;
    String author;
    String type;

    public Book() {                                  //1 ый конструктор  -ПУСТОЙ
    }

    public Book(String name, int pages) {            //2 ой конструктор  -НА ДВА ПАРМЕТРА
        this.name = name;
        this.pages = pages;
    }


    public Book(String name, int pages, int rating, String author, String type) {  //3 ий конструктор  -НА ВСЕ ПАРМЕТРЫ
        this.name = name;
        this.pages = pages;
        this.rating = rating;
        this.name = author;
        this.name = type;
    }

    public boolean recommendedReading() {

        if (rating > 3) {
            return true;
        } else {
            return false;
        }
    }
}
