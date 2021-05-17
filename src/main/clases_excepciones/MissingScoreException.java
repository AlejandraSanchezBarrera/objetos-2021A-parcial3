package clases_excepciones;

public class MissingScoreException extends Exception {

    public MissingScoreException() {
    }

    public MissingScoreException(String message) {
        super(message);
    }
}
