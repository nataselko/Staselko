public class MyArithmeticException extends RuntimeException {

    public MyArithmeticException(String message) {
        super(message + " <3");
    }
}
