package netology.hw132year;

import java.util.Scanner;

class Main {

    public static boolean stop = false;
    public static int dayzKol;
    public static int point = 0;


    public static int initDayzKol(int year,int  dayz){
        if (year % 400 == 0) dayzKol = 366;
        else if (year % 4 == 0 && year % 100 != 0) dayzKol = 366;
        else dayzKol = 365;
        return dayzKol;
    }


    public static void main(String[] args) {
        while (!stop) {
            System.out.println("Введите год в формате \"yyyy\" ");
            Scanner scan = new Scanner(System.in);
            int year = scan.nextInt();
            System.out.println("Введите количество дней в формате \"yyy\" ");
            int dayz = scan.nextInt();


            dayzKol= initDayzKol(year, dayz);


            if (dayz == dayzKol) {
                point++;
                System.out.println("Набрано очков: " + point);
            } else {
                System.out.println("Неправильно! В этом году " + dayzKol + " дней! ");
                System.out.println("Набрано очков:"+point);

                stop=true;
            }

        }
    }
}