package netology.hw321Shooter;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        // Как настоящие программисты мы имеем в виду, что исчисление начинается с 0
        System.out.format("У игрока %d слотов с оружием,"
                        + " введите номер от 1 до %d, чтобы выстрелить,"
                        + " -1 чтобы выйти%n",
                player.getSlotsCount(),
                player.getSlotsCount()
        );
        int slot;

        // TODO главный цикл игры:
        // запрашивать номер с клавиатуры
        // с помощью scanner.nextInt(),
        // пока не будет введено -1

        while(true) {
            String number = scanner.nextLine();
            if( "-1".equals(number)) break;
            if( "0".equals(number)) System.out.println("Введите от 1 до "+player.getSlotsCount());;
            slot=Integer.parseInt(number);
            player.shotWithWeapon(slot-1);
        }

        System.out.println("Game over!");
    }


}
