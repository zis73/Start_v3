package Exception;

public class Main {

    static int neededSize = 4;
    static String[][] arr = {{"1", "2", "3"}, {"1", "2", "3"}, {"1", "2", "3"}, {"1", "2", "3"}};

    public static void main(String[] args) throws MyArraySizeException {
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
        if (arr.length != neededSize) {
            throw new MyArraySizeException(arr.length, neededSize);
        }
    }

    public static void sumArrayContain() throws MyArrayDataException{
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (isInteger(arr[i][j])){
                    try{
                        //i++;
                        //j++;
                        System.out.println("help");
                        String[][] sum = null;
                        sum[i][j] += arr[i][j];
                        System.out.println(sum[i][j]);
                    }catch (Exception a){
                        //System.out.println("В массиве символы");
                    }
                }
            }
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
