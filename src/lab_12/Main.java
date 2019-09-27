package lab_12;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr =new int[n];
        RandomInit(arr,n);
        //int[] arr = {1, 5, 6, 8, 9, 10, 2, 4};
        for (int i = 0; i < arr.length; i++) {
            int least = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[least]) {
                    least = j;
                }
            }
            int res = arr[i];
            arr[i] = arr[least];
            arr[least] = res;

            System.out.println(arr[i]);

        }

    }

    public static void RandomInit(int[] arr, int n) {
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(100);
        }
    }
}
