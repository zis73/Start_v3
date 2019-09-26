package lab_12;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 7, 8, 9, 3, 4, 10};
        for (int i = 0; i < arr.length; i++) {
            int least = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[least]) {
                    least = j;
                } else {
                    int res = arr[i];
                    arr[i] = arr[least];
                    arr[least] = res;
                }
                System.out.println(arr[i]);
            }
        }
    }
}
