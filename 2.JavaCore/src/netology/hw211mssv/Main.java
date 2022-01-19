package netology.hw211mssv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        String[] products = {"Хлеб", "Яблоки", "Молоко", "Гречневая крупа"};
        int[] prices = {60, 110, 70, 80};
        int[] basket = {0, 0, 0, 0};


        printMarket(products, prices);

        input(basket, products);

        endprint(basket, products, prices);


    }

    private static void input(int[] basket, String[] products) throws IOException {
        while (true) {
            System.out.println("Выберите товар и количество (в одну строку чз пробел) или введите \"end\" для завершения");

            String str = buf.readLine();

            if ("end".equalsIgnoreCase(str)) break;

            String[] strInp = str.split(" ");
            int product = Integer.parseInt(strInp[0]) - 1;
            int quantity = Integer.parseInt(strInp[1]);
            basket[product] += quantity;
            System.out.println("В корзину добавлены: \n" + products[product] + " в количестве: " + quantity + " шт.\n" + "Всего: " + basket[product] + " шт.");

        }

    }


    private static void printMarket(String[] products, int[] prices) {

        System.out.println(fence(1));
        System.out.println("Список возможных товаров для покупки");
        System.out.println(fence(2));

        System.out.printf("%-2s %-23s %-6s %s \n", "№", "Наименование товара", "Цена", "ед. изм.");

        for (int i = 0; i < products.length; i++) {
            System.out.printf("%-2s %-23s %-6s %s \n", (i + 1) + ".", products[i], prices[i], "руб./шт.");
        }

        System.out.println(fence(1));

    }

    private static void endprint(int[] basket, String[] products, int[] prices) {
        System.out.println(fence(1));
        System.out.println("Ваша корзина: ");
        System.out.println(fence(2));
        System.out.printf("%-2s %-23s %-13s %-9s %-7s %s \n", "№", "Наименование товара", "Цена за ед.", "ед. изм.", "Кол-во", "Стоимость");


        int sum = 0;
        int cnt = 0;
        for (int i = 0; i < basket.length; i++) {
            if (basket[i] != 0) {
                System.out.printf("%-2s %-23s %-13s %-9s %-7s %s \n", ((cnt++) + 1) + ".", products[i], prices[i], "руб./шт.", basket[i], prices[i] * basket[i]);
                sum += prices[i] * basket[i];
            }
        }

        System.out.printf("%-50s %-6s %-6s %s", " ", "Итого: ", sum, "руб.");

    }


    private static String fence(int type) {
        switch (type) {
            case 1: return "=".repeat(69);
            case 2: return "-".repeat(69);
            default: return "=".repeat(30);
        }
    }


}
