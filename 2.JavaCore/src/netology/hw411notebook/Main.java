package netology.hw411notebook;


//Напишем программу, представляющую собой менеджер списка дел.
// Списки дел можно хранить в массивах и списках.
// Массивы имеют фиксированную длину, и после того как массив создан, он не может расти или уменьшаться.
// ArrayList (одна из имплементаций списка) может менять свой размер во время исполнения программы,
// при этом необязательно указывать размерность при создании объекта.
// Кроме того, вы без проблем можете вставить новый элемент в середину коллекции,
// а также спокойно удалить элемент из любого места.
// Поэтому очень удобно использовать List для ведения списка дел,
// ведь часто бывает, что нужно добавить какие-то дела в середине дня или же что-то удалить.


//Запрос списка задач/дел у пользователя;
//Возможность добавить задачу в список;
//Возможность удалить задачу из списка;
//Возможность вывода всех задач с их номерами (для пользователя нумеровать с 1).


//***
//Создать объект имплементирующей List стандартной коллекции
// со значениями типа String для хранения списка дел

//Используя Scanner scanner = new Scanner(System.in),
// в бесконечном цикле необходимо выводить меню, считывать операцию и сопутствующие ей данные

//Реализуйте операции над списком задач через методы коллекций.
//Для удаления элемента списка по индексу используйте remove(int index),
// не перепутайте его с remove(T e) (где T это тип элементов списка),
// который удаляет ячейку в которой лежит элемент e.


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    private static List<String> tasks = new ArrayList<>();

    public static void printBase(int choose) {
        String out = "";
        switch (choose) {

            case -1:
                out = "\nВыберите действие:\n" +
                        "1. Добавить задачу\n" +
                        "2. Вывести список задач\n" +
                        "3. Удалить задачу\n" +
                        "0. Выход\n"
                ;
                break;
            case 0:
                out = "0. Выход";
                break;
            case 1:
                out = "1.1. Введите задачу для планирования:";
                break;
            case 2:
                out = "2.2 Список задач:";
                break;
            case 3:
                out = "3.3  Введите номер задачи для удаления:";
                break;
            default:
                out = "Пока такого варианта нет. Введите корректный номер операции от 1 до 3 или 0 для выхода";
                break;
        }
        System.out.println(out);
    }


    private static void addTask() {
        printBase(1);

        while (true) {
            String inpStr = scan.nextLine();
            System.out.println("Вы точно хотите добавить этот текст?: " + inpStr);
            System.out.println("Введите \"Y\" для yes и \"N\" для другого");
            String inpStrYN = scan.nextLine();
            if (inpStrYN.equals("Y")) {
                tasks.add(inpStr);
                System.out.println("...Задача добавлена...");
                break;
            } else if (inpStrYN.equals("N")) {
                System.out.println("...ок не будем ее добавлять...");
                return;
            } else {
                System.out.println(" вы не подтвердили но и неопровергли. очень жаль. я всё");
                return;
            }
        }
    }

    private static void printTasks() {
        printBase(2);
        if (tasks.isEmpty()) System.out.println(" ...Отдыхай... задач то и нет...");
        int cnt = 1;

        for (String str : tasks) {
            System.out.println(cnt++ + ". " + str);
        }
    }

    private static void delTask() {
        printBase(3);
        if (tasks.isEmpty()) {
            System.out.println(" ...Отдыхай... задач уже нет...");
            return;
        }

        while (true) {
            System.out.println("Собственно вот задачи: ");
            printTasks();
            System.out.println("Какую по порядку удалить? всего:" + (tasks.size()));

            String inpStr = scan.nextLine();

            if (Character.isLetter(inpStr.charAt(0)) || Integer.parseInt(inpStr) < 1 || Integer.parseInt(inpStr) > (tasks.size())) {
                System.out.println("не смешно");
                return;
            }
            System.out.println("Удаляем номер: " + (Integer.parseInt(inpStr)));
            tasks.remove(Integer.parseInt(inpStr) - 1);
            System.out.println("...Задача удалена...");
            System.out.println("Собственно вот список задач после удаления: ");
            printTasks();
            return;
        }
    }

    private static String inputFirst() {

        String outStr = "";

        while (true) {
            printBase(-1);      //осн меню
            String inpStr = scan.nextLine();
            if (inpStr.isEmpty()) {
                printBase(-3);  //пусто
            } else if (Character.isLetter(inpStr.charAt(0))) {
                printBase(-4); //околесица
            } else if (Integer.parseInt(inpStr) > 3) {
                printBase(666);  //пока такого пункта нет
            } else if (Integer.parseInt(inpStr) < 0) {
                printBase(-5);  //меньше 0
            } else if (Integer.parseInt(inpStr) == 0) {
                printBase(0);  // выход
                outStr = inpStr;
                break;
            } else if (Integer.parseInt(inpStr) > 0 && Integer.parseInt(inpStr) < 4) {
                outStr = inpStr;
                break;
            }
        }
        return outStr;
    }

    public static void main(String[] args) {

        while (true) {
            String strInp = inputFirst();
            if (strInp.equals("0")) break;
            int strInpInt = Integer.parseInt(strInp);
            if (strInpInt == 1) addTask();
            else if (strInpInt == 2) printTasks();
            else if (strInpInt == 3) delTask();
        }
    }
}