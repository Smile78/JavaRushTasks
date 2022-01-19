package netology.hw341chekRes;

public class UserNotFoundException extends Exception{
    UserNotFoundException(String val){
        super(String.format("Пользователь c таким '%s' не найден", val));
    }
}
