

// Сегодня мы будем реализовывать программу для работы лифта 25-и этажного дома.
// Нужно написать программу, которая считывает данные из консоли, ожидая ввода номера этажа.
// После ввода каждого числа (номера этажа) добавляет значение в очередь дальнейшего перемещения лифта.
// Как только пользователь введет 0, программа должна последовательно вывести список всех этажей,
// на которых лифт делал остановки, в формате: "этаж 1 -> этаж 22 -> этаж 0".
// Если пользователь ввел этаж вне диапазона 0-25, проигнорировать ввод таких данных.
// Для реализации хранения введенных пользователем этажей отлично подойдет структура на основе интерфейса очередь (queue).
// По мере ввода мы сможем добавлять в конец очереди новые значения.


package netology.hw421elevator;


import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    static Queue<Integer> qu1 = new ArrayDeque<>();
    static int stgs = 25;

    private static void input() {
        //В бесконечном цикле считывать номера этажей до тех пор, пока не будет введен нулевой этаж.
        Scanner scan = new Scanner(System.in);

        System.out.println("Пожалуйста Введите номер следующего этажа от 1 до 25 по порядку следования или 0 для старта и нажмите энтер");

        while (true) {
            System.out.println("Ожидаю ввода этажа: (для завершения введите 0)");
            String inpStr = scan.nextLine();
            int inpFloor;

            if (Character.isLetter(inpStr.charAt(0))) {
                System.out.println("это не цифра");
            }
            //а если с цифры но потом абркадабра
            else if (Integer.parseInt(inpStr) == 0) {
                inpFloor = Integer.parseInt(inpStr);
                qu1.offer(inpFloor);
                System.out.println("Погнали!");
                break;
            } else if (Integer.parseInt(inpStr) < 0 || Integer.parseInt(inpStr) > stgs) {
                System.out.println("Такого этажа нет в доме");
            } else if (Integer.parseInt(inpStr) > 0 || Integer.parseInt(inpStr) <= stgs) {
                inpFloor = Integer.parseInt(inpStr);
                qu1.offer(inpFloor);
            } else {
                System.out.println("404");
            }
        }
    }

    private static void madElevator() {

// рассчитать время движения лифта вместе с остановками                                     //  -- получается с учетом открытия и закрытия на 25 и 0
//        Скорость движения лифта между парой этажей равна 5 секунд,                        //  -- получается в смысле просто му двумя этажами а не парой пролетов
//            время остановки на открытие и закрытие дверей лифта 10 секунд

        int waitDoorsInSeconds = 10;         //- количество секунд, которое потребуется на закрытие/открытие дверей;
        int waitMoveInSeconds = 5;          //- количество секунд, затрачиваемое лифтом на движение между этажами;
        int totalSeconds = 0;              //- всего потрачено времени на движение и остановки лифтом;
        int previousFloor = stgs;         //- переменная для хранения предыдущей остановки.


        System.out.println("Лифт проследовал по следующим этажам: ");

        while (!qu1.isEmpty()) {
            int currentFloor = qu1.poll();
            System.out.print("этаж " + currentFloor + (qu1.size() == 0 ? "" : " -> "));

            totalSeconds += Math.abs(currentFloor - previousFloor) * waitMoveInSeconds;
            totalSeconds += waitDoorsInSeconds;
            previousFloor = currentFloor;
        }

        System.out.println("");
        System.out.println("Время затраченное лифтом на маршрут =: " + totalSeconds + " с.");
    }


    public static void main(String[] args) {

        input();

        madElevator();

    }
}


