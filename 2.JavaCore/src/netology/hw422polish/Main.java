package netology.hw422polish;


// написать программу перевода инфиксной записи (например 2 + 3) в постфиксную запись (2 3 +) !!!

// Необходимо реализовать алгоритм на основе очереди,
// который прочитает математическое выражение,
// найдет все числа
// и сохранит их отдельно от знаков (в отдельную коллекцию).


//***

// упрощенную  не: 7*2-3   72*3-  +

// лучше не через СТЭК +

// можно
// регулярки
// можнол вхождение оператарми
// от if else

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите математическую формулу:");
        String input = scanner.nextLine();

        Queue<Integer> numbers = new LinkedList<>();
        Deque<String> sign = new ArrayDeque<>();             // типо лучше чем стек...??

        //можно использовать Stream API или преобразовать в List
        //регулярки..
        // а так ??

//        input=input.replaceAll("\s", "");                     // можно вводить с пробеами  но без 2значных цифр...
//        String[] arrayValues = input.split("");

        String[] arrayValues = input.split(" ");          // млжно вводить 2знач числа  но надо вводить с проблеами и нельзя первый пробел
        // можно все по пацански сделать чтоб без разницы но потом

        for (int i = 0; i < arrayValues.length; i++) {
            String value = arrayValues[i];
            if (Character.isDigit(value.charAt(0))) {
                numbers.add(Integer.parseInt(value));        // доб в конц
            } else {
                sign.add(value);                             // доб в конц
            }
        }

        while (!numbers.isEmpty()) {
            System.out.print(numbers.poll() + " ");
        }

        while (!sign.isEmpty()) {
            System.out.print(sign.pollLast() + " ");
        }

        System.out.println("\nThats all Folks!!!");
    }

}
