package Exception;

public class Main {
    static String sum;
    static int getI;
    static int getI2;
    static int neededSize = 3;
    static String[][] arr = {{"1", "2", "4"}, {"1", "2", "3"}, {"1", "2", "3"}};

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        System.out.println("Checking array size...");

        try {
            checkArraySize(arr);
        } catch (MyArraySizeException e) {
            System.out.println("Array size incorrect");
            return;
        }
        System.out.println("Checking array size complete, it's okay");
        System.out.println("---------");
        System.out.println("Try to sum array values");
        try {
            sumArrayContain(arr);
        } catch (MyArrayDataException a) {
            System.out.println(MyArrayDataException.info);
            return;
        }
        System.out.println("It's okay");
    }

    public static void checkArraySize(String[][] arr) throws MyArraySizeException {
        if (arr.length != neededSize) {
            throw new MyArraySizeException("За пределами массива");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != neededSize) {
                throw new MyArraySizeException("incorrect");
            }
        }
    }


    public static void sumArrayContain(String[][] arr) throws MyArrayDataException {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                getI = i;
                getI2 = j;
                if (isInteger(arr[i][j])) {
                    arr[i][j] = String.valueOf(arr[i][j]);
                    sum += arr[i][j];
                } else {
                    throw new MyArrayDataException("Gotta", getI);
                }
            }
        }
    }

    static boolean isInteger(String arr) {
        try {
            Integer.valueOf(arr);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
