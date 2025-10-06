public class NoEException extends RuntimeException {
    public NoEException() {
        super("Word does not contain an e");
    }
}
