package netology.hw142Double;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double number1Dbl;
        float number2Fl;


        while (true){
            System.out.println("Операции над double/float");
            System.out.println("1. Сравнить");
            System.out.println("2. Округлить");
            System.out.println("3. Отбросить дробную часть");

            String text = scan.nextLine();
            if (text.equalsIgnoreCase("end")) break;
            int textInt = Integer.parseInt(text);
            switch (textInt){
                case 1:
                    System.out.println("Операция: Сравнение");
                    System.out.println("Введите первое число:");
                    String text11 = scan.nextLine();
                    double text11dbl = Double.parseDouble(text);

                    System.out.println("Введите второе число:");
                    String text12 = scan.nextLine();
                    float text12flt = Float.parseFloat(text);

                    System.out.println("Результат:");

                    double dif =Math.abs (text11dbl-text12flt);
                    double err= 0.009;

                    if (dif<err) System.out.println("числа равны");
                    else if (text11dbl>text12flt) System.out.println("первое больше");
                    else  System.out.println("второе больше");
                    System.out.println("");

                    break;

                case 2:
                    System.out.println("Операция: Округление");
                    System.out.println("Введите число: ");
                    String text21 = scan.nextLine();
                    double text21dbl = Double.parseDouble(text21);

                    int text21dblINT =  (int)Math.round(text21dbl);
//                    double text21dblINT =   Math.round(text21dbl);

                    System.out.println("Округленное число: "+ text21dblINT);
                    System.out.println("");

                    break;

                case 3:
                    System.out.println("Операция: Отбросить дробную часть");

                    System.out.println("Введите число: ");
                    String text31 = scan.nextLine();
                    double text31dbl = Double.parseDouble(text31);

                    long text31dblINT = (long)text31dbl;

                    System.out.println("Число без дробной части:"+ text31dblINT);
                    System.out.println("");

                    break;

            }




        }

    }
}
