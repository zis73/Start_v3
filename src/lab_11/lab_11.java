package lab_11;

public class lab_11 {
    public static void main(String[] args) {

        int[] arr = {8, 1, 3, 5, 7, 6, 4};
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int minI = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minI = j;
                }
            }
            if (i != minI) {
                int tmp = arr[i];
                arr[i] = arr[minI];
                arr[minI] = tmp;
            }
            System.out.println(arr[i]);
        }
    }
}
