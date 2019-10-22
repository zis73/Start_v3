package Exception;

public class Main {

    static int neededSize = 4;

    public static void main(String[] args) {
        String[][] arr = {{"1", "2", "3"}, {"1", "2", "3"}, {"1", "2", "3"}, {"1", "2", "3"}};
        System.out.println("Checking array size...");

        try {
            checkArraySize(arr);
        } catch (MyArraySizeException e) {
            System.out.println("Array size incorrect");
            return;
        }
        System.out.println("Checking complete, it's okay");
    }

    public static void checkArraySize(String[][] arr) throws MyArraySizeException {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                String string;
                if (isInteger(string)) {

                }
            }
        }
        if (arr.length != neededSize) {
            throw new MyArraySizeException(arr.length, neededSize);
        }
    }

    static boolean isInteger(String string) {
        try {
            Integer.valueOf(string);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("В массиве есть символы");
            return false;
        }
    }
}
