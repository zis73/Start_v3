package Exception;

public class MyArrayDataException extends Exception{
    String gotta;
    int num;
    public static String info = "Array have symbols";

    public MyArrayDataException(String gotta, int num) {
        super(gotta);
        this.num = num;
    }
}
