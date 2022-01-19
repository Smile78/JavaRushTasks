package netology.hw341chekRes;


// Во время запуска программы нужно запросить логин или пароль пользователя.
// Если один из введеных параметров не совпадает (логин/пароль),
// то нужно выбросить checked исключение UserNotFoundException.
//
// Если возраст пользователя менее 18 лет,
// то нужно выбросить исключение AccessDeniedException,
//
// а если 18 и больше лет
// - вывести сообщение "Доступ предоставлен".
//

// Массив пользователей для авторизации нужно описать до запуска программы.
// Каждая запись пользователя содержит поля:
// login, password, age (возраст) и email.


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static User[] getUsers() {
        User massUsers[] = new User[]{
                new User("Dron", "dronpass", 38, "dron@gmail.com"),
                new User("Helga", "helgapass", 35, "hellga@gmail.com"),
                new User("Heizy", "heizypass", 5, "heizy@gmail.com")
        };
        return massUsers;
    }

    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
        User[] users = getUsers();
        int cntAllWrng = 0;
        User usrBck = users[0];

        for (User usr : users) {
            if (usr.login.equals(login) & usr.password.equals(password)) usrBck = usr;
            if (usr.login.equals(login) & !usr.password.equals(password)) throw new UserNotFoundException("пароль");
            if (!usr.login.equals(login) & (usr.password.equals(password))) throw new UserNotFoundException("логин");
            if (!usr.login.equals(login) & (!usr.password.equals(password))) {
                cntAllWrng++;
                if (cntAllWrng >= users.length) throw new UserNotFoundException("логин и пароль");
            }
        }
        return usrBck;
    }

    public static void validateUser(User user) throws AccessDeniedException {
        if (user.age >= 18)
            System.out.println("Access granted"); // допустим записи уникальные
        if (user.age < 18)
            throw new AccessDeniedException("PG18");
    }

    public static void main(String[] args) throws UserNotFoundException, AccessDeniedException {

        User massUsersMain[] = getUsers();

        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String login = "";
        String password = "";

        try {
            System.out.println("Введите логин");
            login = buf.readLine();
            System.out.println("Введите пароль");
            password = buf.readLine();

        } catch (IOException e) {
            e.printStackTrace();
        }

        User usr = getUserByLoginAndPassword(login, password);

        validateUser(usr);

    }
}
