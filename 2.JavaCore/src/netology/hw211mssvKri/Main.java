package netology.hw211mssvKri;
//https://replit.com/@AndrewNikitin1/reright21#Main.java


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] products = {"Шоколад", "Сок", "Мороженое", "Чипсы"};
        int[] prices = {100, 200, 80, 50};
        int[] sumProducts = new int[4];
        int[] sum = new int[4];
        int totalSum = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Список доступных товаров для покупки:");

        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i] + " " + prices[i] + " руб./шт.");
        }

        while (true) {
            System.out.println("Выберите товар и количество через пробел или введите 'end', затем нажмите Enter");
            String line = scanner.nextLine();

            if (line.equals("end"))  break;

            String[] parts = line.split(" ");


            int product = Integer.parseInt(parts[0]) - 1;
            int quantity = Integer.parseInt(parts[1]);

            sumProducts[product]+=quantity;
            sum[product]=sumProducts[product]*prices[product];

        }

        System.out.println("Ваша корзина:");
        System.out.println("Наименование товара Количество  Цена за ед. Общая стоимость");
        System.out.println("Шоколад                " + sumProducts[0]+"           "+ prices[0]+"           "+ sum[0] );
        System.out.println("Сок                    " + sumProducts[1]+"           "+ prices[1]+"           "+ sum[1] );
        System.out.println("Мороженое              " + sumProducts[2]+"           "+ prices[2]+"            "+ sum[2] );
        System.out.println("Чипсы                  " + sumProducts[3]+"           "+ prices[3]+"            "+ sum[3] );

        for (int i = 0; i <products.length ; i++) {
            totalSum +=  sum[i];
        }

        System.out.println("Итоговая сумма   " + totalSum +" руб." );

    }
}
