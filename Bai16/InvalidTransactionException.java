package Bai16;

@SuppressWarnings("serial")
public class InvalidTransactionException extends Exception {
    public InvalidTransactionException(String message) {
        super(message);
    }
}