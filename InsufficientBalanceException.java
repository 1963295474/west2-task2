package Task3;

public class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException() {
        super();
    }

    public InsufficientBalanceException(String information, Throwable throwable) {
        super(information, throwable);
    }

    public InsufficientBalanceException(Throwable throwable) {
        super(throwable);
    }

    public InsufficientBalanceException(String information) {
        super(information);
    }
}
