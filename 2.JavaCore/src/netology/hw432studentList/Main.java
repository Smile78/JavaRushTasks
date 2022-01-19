package netology.hw432studentList;


// Вы разрабатываете систему учета студентов.
// Для каждого студента нужно хранить следующие данные
// – ФИО, номер группы, номер студенческого билета.
// Уникальным идентификатором является номер студенческого билета. --?? final??

// Пользователь вводит данные студентов в бесконечном цикле до ввода команды "end".

// По окончании ввода программа должна вывести список студентов.
// Структура данных, куда сохраняются студенты, должна отбрасывать ввод студента с уже существующим в базе id
// и писать об этом пользователю.
// Учитывайте, что имена у людей могут быть одинаковыми, а номера документов – нет.


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static  Set<Student> students = new HashSet<>();

    static void addStudent(String name, String group, String studentId) {
        boolean kmo = students.add(new Student(name, group, studentId));
        if (!kmo)
            System.out.println(name + ", " + group + ", " + studentId + " не добавлен потому что  студент с таким ИД уже есть");
    }

    public static void main(String[] args) {

        addStudent("Иванов Петр Николаевич", "1243-Б", "333");
        addStudent("Иванов Петр Николаевич", "1243-Б", "333");//не добавит
        addStudent("Иванов Петр Николаевич", "1243-Б", "444");//добавит
        addStudent("Петрова Татьяна Михайловна", "1243-Б", "43221343");

        System.out.println("Список студентов:");
        for (Student stud : students) {
            System.out.println(stud);
        }

        Scanner scan = new Scanner(System.in);

        String[] str;

        String fio = "";
        String group = "";
        String studId = "";

        System.out.println("Введите информацию о студенте: \"ФИО, номер группы, номер студенческого билета\" ");
        System.out.println("чз запятую в след формате: \nИванов Петр Николаевич, 1243-Б, 31231343 ");
        String inpStr;


        while (true) {
            System.out.println("Введите информацию о студенте (для завершения работы программы введите \"End\")");
            inpStr = scan.nextLine();

            if ("end".equals(inpStr.toLowerCase())) {
                break;
            }

            str = inpStr.split(", ");

            fio = str[0].trim();
            group = str[1].trim();
            studId = str[2].trim();

            addStudent(fio, group, studId); // или в Мейн лучше это метод описать?
        }

        System.out.println("Список студентов:");
        for (Student stud : students) {
            System.out.println(stud);
        }

    }
}
