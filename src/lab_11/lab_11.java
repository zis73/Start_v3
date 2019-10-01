package lab_11;

public class lab_11 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 8, 2, 3, 4, 7};
        for (int i = 1; i < arr.length; i++) {
            int first = arr[i];
            for (int j = i-1; j < arr.length && arr[j] > first ; j++){
                arr[j] = first;
            }
            System.out.println(arr[i]);
        }
    }
}
