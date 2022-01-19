package netology.hw341chekRes;

public class AccessDeniedException extends Throwable {
    public AccessDeniedException(String pg18) {
        super(String.format(" restricted admission '%s'" , pg18));
    }
}
