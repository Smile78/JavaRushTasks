package netology.hw141USN;

import java.util.Scanner;
class Main{

    public static int taxEarningsOnly(int earnings ) {
        int tax =  earnings   * 6 / 100; // лучше int в копейках деньги чтобы флоат не пропадал
//        float tax =  earnings   * 0.06f;
        return tax;
    }

    public static int taxEarnSpend(int earnings, int spendings) {
        int tax = (earnings - spendings) * 15 / 100;

        return tax>=0? tax: 0;
//        if (tax >= 0) {
//            return tax;
//        } else {
//            // если расходы оказались больше, то налог посчитается отрицательным
//            return 0;
        }



    public static void main(String[] args) {
        //Создаем scanner - объект, который будет считывать из стандартного потока ввода/вывода (console)
        Scanner scanner = new Scanner(System.in);
        String input;

        int earnings = 0;    // доходы
        int spendings = 0;   // расходы

        //Цикл будет работать, пока пользователь не введет `end`
        while (true) {
            // Выводим информацию о возможных операциях пользователю
            System.out.println(" Выберите операцию и введите её номер:");
            System.out.println(" 1. Добавить новый доход");
            System.out.println(" 2. Добавить новый расход");
            System.out.println(" 3. Выбрать сиcтему налогооблажения");


            input = scanner.nextLine();
            if ("end".equals(input)) {  //
                break;
            }


            int operation = Integer.parseInt(input);
            switch (operation) {
                case 1:
                    System.out.println("Введите сумму дохода:");
                    String moneyStr = scanner.nextLine(); // Не используйте тут nextInt (!)
//                    никакого float...
                    float money11 = Float.parseFloat(moneyStr);
                    int money12 = (int)(money11*100);  // деньги в копейках
//                    int money = Integer.parseInt(moneyStr);
                    earnings += money12;
//                    earnings += money;
                    break;
                case 2:
                    // действия при выборе второй операции
                    System.out.println("Введите сумму расхода:");
                    String moneyStr2 = scanner.nextLine(); // Не используйте тут nextInt (!)
                    float money21 = Float.parseFloat(moneyStr2);
                    int money22 = (int)(money21*100);  // деньги в копейках

//                    int money2 = Integer.parseInt(moneyStr2);
                    spendings += money22;
                    break;
                case 3:
                    // действия при выборе   операции
                    int taxUSN6;
                    taxUSN6=taxEarningsOnly(earnings);
                    int taxUSNEarnSpend;
                    taxUSNEarnSpend=taxEarnSpend(earnings, spendings);

                    float taxUSN6Float= taxUSN6/100;
                    float taxUSNEarnSpendFloat= taxUSNEarnSpend/100;

                    if (taxUSN6<taxUSNEarnSpend){

                        System.out.println("Мы советуем вам УСН доходы");
                        System.out.println("Ваш налог составит: "+ taxUSN6Float +" рублей");
//                        System.out.println("Ваш налог составит: "+ taxUSN6 +" рублей");
                        System.out.println("Налог на другой системе: "+ taxUSNEarnSpendFloat +" рублей");
//                        System.out.println("Налог на другой системе: "+ taxUSNEarnSpend +" рублей");
                        System.out.println("Экономия: " + (taxUSNEarnSpendFloat - taxUSN6Float) +" рублей");
//                        System.out.println("Экономия: " + (taxUSNEarnSpend - taxUSN6) +" рублей");
                    } else   {


                        System.out.println("Мы советуем вам УСН доходы минус расходы");
                        System.out.println("Ваш налог составит: "+ taxUSNEarnSpendFloat +" рублей");
//                        System.out.println("Ваш налог составит: "+ taxUSNEarnSpend +" рублей");
                        System.out.println("Налог на другой системе: "+ taxUSN6Float +" рублей");
//                        System.out.println("Налог на другой системе: "+ taxUSN6 +" рублей");
                        System.out.println("Экономия: " + (taxUSN6Float - taxUSNEarnSpendFloat) +" рублей");
//                        System.out.println("Экономия: " + (taxUSN6 - taxUSNEarnSpend) +" рублей");

                    }
                    break;
                default:
                    System.out.println("Такой операции нет");
            }



        }
        System.out.println("Программа завершена!");
    }
}
