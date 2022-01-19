package com.javarush.task.task16.task1633;

public class Solution_answer {


    /*
               Создаём две переменные-ссылки типа Thread.UncaughtExceptionHandler (интерфейс, связанный с неконтролируемыми
               исключениями), которые указывают на объекты двух созданных нами классов (OurUncaughtExceptionHandler и
               OurCaughtExceptionHandler2). Можно сказать, что эти переменные являются пользовательской версией
               обработки неконтролируемых исключений (по аналогии как переопределение метода toString() )
            */
    public static Thread.UncaughtExceptionHandler myHandler = new OurUncaughtExceptionHandler();
    public static Thread.UncaughtExceptionHandler myHandler2 = new OurUncaughtExceptionHandler2();

    public static void main(String[] args) throws InterruptedException {    // Thread_000  МЕЙН старт !!!!
        /*
        Создаём нить commonThread типа TestThread. В конструктор передаём переменную-ссылку myHandler
         */

        TestThread commonThread = new TestThread(myHandler);                //  Thread_001  и автостарт !!!!


        /*
        Создаём две нити ThreadA и ThreadB, которые основаны на нити commonThread и имеют соответствующие
        названия "Нить А" и "Нить В". Т.к. новые нити основаны на нити commonThread, то и реализация метода run() будет та,
        которая прописана в классе TestThread
         */
        Thread threadA = new Thread(commonThread, "Нить А");         //    Thread_A но нестарт  !!!!
        Thread threadB = new Thread(commonThread, "Нить В");         //    Thread_B но нестарт  !!!!
        /*
        Для нити threadA и нити threadB устанавливаем обработчик неконтролируемых исключений, который прописан
        в объектах myHandler и myHandler2
        */

                /*
                 Для класса TestedThread создан конструктор в котором выполняется установка setUncaughtExceptionHandler(handler)
                 и, может показаться, что этого достаточно.
                 Но далее мы создаем две нити threadA и threadB, передавая им в качестве параметра объект класса commonThread.
                 Который при передаче сужается до объекта Runnable(смотря аргументы конструктора Thread).
                 Таким образом информация об необходимом обработчике не поступает в конструктор нитей.
                 Для того чтобы всетаки установить обработчик, после создания нитей надо явно указать для них обработчики строками
                 threadA.setUncaughtExceptionHandler(handler); и threadB.setUncaughtExceptionHandler(handler);
                 */
        threadA.setUncaughtExceptionHandler(myHandler);
        threadB.setUncaughtExceptionHandler(myHandler2);

        /*
         Запускаем нить threadA и тут же прерываем её методом interrupt(). Согласно методу run(), нить спит 3 секунды.
         Однако прерывание interrupt() происходит сразу же, что вызывает исключение InterruptedException.
         Блоком catch это исключение ловится и в этом же блоке вызывается неконтролируемое исключение RuntimeException,
         в аргументе которого передаётся строка, которая будет выводиться.
         Было написано, что нить threadA обрабатывает исключения согласно обработчику, написанному в myHandler.
         Нить threadB обрабатывает неконтролируемое исключение так, как указано в myHandler2
         */
        threadA.start();
        threadA.interrupt();

        // Аналогичная ситуация с нитью threadB
        threadB.start();
        /*
        Метод interrupt() устанавливает переменную isInterrupt нити-объекта, у которой вызыван этот метод, в положение true
        Это останавливает нить, переводя переменную isInterrupt в положение true
         */
        threadB.interrupt();
    }
        // Класс TestThread, унаследованный от класса-предка Thread
        public static class TestThread extends Thread {
            /*
            Конструктор, в качестве аргумента которого принимается переменная handler типа Thread.UncaughtExceptionHandler
             */
            public TestThread(Thread.UncaughtExceptionHandler handler) {
                // Для всех нитей этого класса применяется правило обработки неконтролируемых исключений, занесённое в handler
                setUncaughtExceptionHandler(handler);
                // При создании нити она тут же запускается
                start();
            }

            // Метод run(), объясняющий выполнение нити при запуске start()
            public void run() {
                try {
                    // Нить спит 3 секунды
                /*
                В методе sleep, который так любят использовать для организации вечного цикла
                в методе run, есть автоматическая проверка переменной isInterrupt.
                Если нить вызовет метод sleep, то этот метод сначала проверит, а не установлена ли для текущей
                (вызвавшей его нити) переменная isInterrupt в true. И если установлена, то метод не будет спать,
                а выкинет исключение InterruptedException.
                 */
                    Thread.sleep(3000);
                }
            /*
            Если объект находился в этот момент в состоянии ожидания, например, join или sleep,
            ожидание будет прервано, и программа выбросит InterruptedException.
             */
                catch (InterruptedException e) {
                    // Выбрасывается исключение RuntimeException
                    throw new RuntimeException("My exception message");
                }
            }
        }



    /*
    Класс, реализующий интерфейс Thread.UncaughtExceptionHandler.
    На объект этого класса ссылается переменная myHandler
    Этот интерфейс включает лишь метод uncaughtException() c параметрами Thread t  (нить) и Throwable e (ошибка)
     */
        public static class OurUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
            // Переопределяем метод интерфейса
            @Override
            public void uncaughtException(Thread t, Throwable e) {
            /*
            getName() показывает имя нити, которое было установлено при создании нити или же имя по умолчанию
            getMessage() выводит строку, которая была передана в качестве аргумента исключению RuntimeException
             */
                System.out.println(t.getName() + ": " + e.getMessage());
            }
        }

    /*
    Класс, реализующий интерфейс Thread.UncaughtExceptionHandler.
    На объект этого класса ссылается переменная myHandler2
     */
        public static class OurUncaughtExceptionHandler2 implements Thread.UncaughtExceptionHandler {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("Отработал второй свод правил обработки неконтролируемых исключений");
            }
        }



}
