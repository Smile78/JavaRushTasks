package netology.hw411notebook;

public class EmptyException extends Throwable {
    EmptyException(){
        super(String.format("Введено пустое значение"));
    }
}
