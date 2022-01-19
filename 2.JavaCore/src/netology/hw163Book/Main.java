package netology.hw163Book;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Author aut01 = new Author("Robert", "Lafore", 1938);
        Author aut02 = new Author("Brian", "Getz", 0000);
        Author aut03 = new Author("Steve", "McConnell", 1962);

        ArrayList<Author> autList = new ArrayList<>();
        autList.add(aut01);
        autList.add(aut02);
        autList.add(aut03);

        Book book1main = autoNewBook(aut01);
        Book book21main = new Book("Concurency", aut02, 464, 2006, 790, 4);
        Book book22main = new Book("Concurency", aut02, 470, 2015, 850, 5);
        Book book3main = new Book("Code Complete", aut03, 896, 2017, 1260, 4);
        Book book4main = new Book("OOP C++", aut01, 928, 2018, 941, 3);
//         Book book5main= inputNewBook(autList);

        ArrayList<Book> bookList = new ArrayList();
        bookList.add(book1main);
        bookList.add(book21main);
        bookList.add(book22main);
        bookList.add(book3main);
        bookList.add(book4main);
//         bookList.add(book5main);

        for (Book book : bookList) {
            for (Author aut : autList) {
                if (book.author.firstName.equals(aut.firstName) &&
                        book.author.secondName.equals(aut.secondName))
                    aut.addBook2Author(book);
            }
        }

        User usr1 = new User("edi@ya.ru", "Edi", "Merfi", book1main);
        User usr2 = new User("jim@google.com", "Jim", "Keri", book21main);
        User usr3 = new User("bil@yahoo.com", "Bil", "Murei", book1main);
        //переделать на списки книг

        ArrayList<User> usrList = new ArrayList<>();
        usrList.add(usr1);
        usrList.add(usr2);
        usrList.add(usr3);

        printmethod(bookList, autList, usrList);

        System.out.println(fence(3) + "Сравнение" + fence(3));
        book1main.equalsBooks(book1main);
        book1main.equalsBooks(book21main);
        book21main.equalsBooks(book22main);


    }

    private static String fence(int type) {
        switch (type) {
            case 1: return "=".repeat(69);
            case 2: return "-".repeat(69);
            default: return "=".repeat(30);
        }
    }


    private static void printmethod(ArrayList<Book> bookList, ArrayList<Author> autList, ArrayList<User> usrList) {
        System.out.println(fence(1) + "\n" + "05 - Онлайн-читалка" + "\n" + fence(1));
        System.out.println("Всего книг в наличии: " + Book.totalLibNumb);

        int totalCost = 0;
        int minPrice = 10000;
        int maxPrice = 0;

        for (Book book : bookList) {
            totalCost += book.price;
            if (book.price < minPrice) minPrice = book.price;
            if (book.price > maxPrice) maxPrice = book.price;
        }

        System.out.println("Общая стоимость: " + totalCost);
        System.out.println("Min цена: " + minPrice + "            " + "Max цена: " + maxPrice);
        System.out.println("Min рейтинг книги: " + Book.minRating + "     " + "Max рейтинг книги: " + Book.maxRating);
        System.out.println(fence(2));

        for (Book book : bookList) {
            System.out.println(book.toString());
        }

        System.out.println(fence(1) + "\n" + "Всего доступно авторов: " + Author.totalQntAuth + "\n" + fence(2));

        for (Author aut : autList) {
            System.out.println(aut.toString());
        }

        System.out.println(fence(1) + "\n" + "Всего онлайн читателей: " + User.totalUserCnt + "\n" + fence(1));


        for (User usr : usrList) {
            System.out.println(usr.toString());
        }
        System.out.println(fence(1));

    }

    private static Book inputNewBook(ArrayList<Author> autList1) {

        Author aut0101 = null;

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите пожалуйста реквизиты книги (без кавычек, с большой буквы)");
        System.out.println("Наименование книги: ");
        String str1Name = scan.nextLine();
//        System.out.println("ФИО Авторов через запятую: ");
        System.out.println("Фамилия Автора (англ буквами): ");
        String str2FIO = scan.nextLine();
        for (Author arr : autList1) {
            if (arr.secondName.equals(str2FIO)) aut0101 = arr;
        }
        System.out.println("Количество страниц в книге: ");
        String str3Qnt = scan.nextLine();
        int str3QntInt = Integer.parseInt(str3Qnt);
        System.out.println("Год издательства книги: ");
        String str4Year = scan.nextLine();
        int str4YearInt = Integer.parseInt(str4Year);
        System.out.println("Стоимость книги: ");
        String str5Price = scan.nextLine();
        int str5PriceInt = Integer.parseInt(str5Price);
        System.out.println("Рейтинг книги: ");
        String str6Rat = scan.nextLine();
        int str6RatInt = Integer.parseInt(str6Rat);

        Book book1 = new Book(str1Name, aut0101, str3QntInt, str4YearInt, str5PriceInt, str6RatInt);
//        Book book1 = new Book(str1Name,str2FIO,str3QntInt,str4YearInt,str5PriceInt);

        return book1;

    }

    private static Book autoNewBook(Author aut1) {

        String str1Name = "Structure Java";
        Author str2FIO = aut1;
        int str3QntInt = 701;
        int str4YearInt = 2017;
        int str5PriceInt = 958;
        int str6RatInt = 4;

        Book book1 = new Book(str1Name, str2FIO, str3QntInt, str4YearInt, str5PriceInt, str6RatInt);

        return book1;

    }
}
