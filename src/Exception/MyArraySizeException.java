package Exception;

public class MyArraySizeException extends Exception {
    String s;

    public MyArraySizeException(String s) {
        super(s);
    }
}
