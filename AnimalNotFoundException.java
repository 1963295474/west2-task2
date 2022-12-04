package Task3;

public class AnimalNotFoundException extends RuntimeException {


    public AnimalNotFoundException() {
        super();
    }

    public AnimalNotFoundException(String information, Throwable throwable) {
        super(information, throwable);
    }

    public AnimalNotFoundException(Throwable throwable) {
        super(throwable);
    }

    public AnimalNotFoundException(String throwable) {
        super(throwable);
    }
}
