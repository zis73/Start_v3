package Exception;

public class MyException extends Exception {
    private int length, neededLength;


    public MyException(int length, int neededLength) {
        super("Введена не верная длина массива" + neededLength + ", а вы ввели:" + length);
        this.length = length;
        this.neededLength = neededLength;
    }

    public int getLength() {
        return length;
    }

    public int getNeededLength() {
        return neededLength;
    }
}
