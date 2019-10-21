package Exception;

public class MyException extends Exception{
    String msg;

    public MyException(String msg){
        super(msg);
    }
}
