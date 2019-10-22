package Exception;

public class Main {

    static int neededSize = 4;

    public static void main(String[] args) {
        String[][] arr = {{"1", "2", "3"}, {"1", "2", "3"}, {"1", "2", "3"}, {"1", "2", "3"}};
        System.out.println("Checking array size...");

        try {
            checkArraySize(arr);
        } catch (MyException e) {
            System.out.println("Array size incorrect");
            return;
        }
        System.out.println("Checking complete, it's okay");
    }

    public static void checkArraySize(String[][] arr) throws MyException {
        if (arr.length != neededSize) {
            throw new MyException(arr.length, neededSize);
        }
    }
}
