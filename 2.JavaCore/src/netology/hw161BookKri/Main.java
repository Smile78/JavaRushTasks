package netology.hw161BookKri;

public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в нашу библиотеку!");

        Book book = new Book();                      //1 ый конструктор  -ПУСТОЙ   -ничего не пердаем- все заносим потом вручную
        book.name = "Сказки для детей";
        book.pages = 125;
        book.rating = 4;
        book.author = "А.С. Пушкин";
        book.type = "Художественная литература";


        Book book3 = new Book("Изучаем  Python", 301);          //2ой  конструктор  -2а парметра передаем остальное заносим
        book3.rating = 3;
        book3.author = "Эрик Мэтиз";
        book3.type = "Учебная литература";


        Book book2 = new Book("Хиппи",230,5,"Пауло Коэльо","Художественная литература");
                                                                                //3ий  конструктор  -передаем СРАЗУ ВСЕ




        System.out.println("Книга: Сказки для детей рекомендуется к чтению? " + book.recommendedReading());
        System.out.println("Книга: Хиппи рекомендуется к чтению? " + book2.recommendedReading());
        System.out.println("Книга: Изучаем  Python рекомендуется к чтению? " + book3.recommendedReading());

        toString(book);
        toString(book2);
        toString(book3);
    }

    public static void toString(Book book) {

    }
}
