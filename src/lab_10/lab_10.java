package lab_10;

import java.util.Random;

public class lab_10 {
    public static void main(String[] args) {
        int[] arr = {1, 5, -3, 44, 77, 100, 4, -8};//-8,-3,1,4,5,44,77,100
        int[] result;
        int j = 0;

    }


    public int[] Merge(int[] arr) {
        int len = arr.length / 2;
        int[] first = new int[len];
        int[] second = new int[first.length - len];
        if (arr.length <= 1) {
            return arr;
        } else {
            System.arraycopy(arr, 0, first, 0, len);
            System.arraycopy(arr, first.length, second, 0, second.length);
        }
        Merge(first);
        Merge(second);
//sortMerge();
        return arr;
    }
}
// public static void RandomInit(int[] mas, int n) {
//
// }

// int[] mas = new int[100];
// for (int i = 0; i < mas.length; i++) {
// Random rand = new Random();
// mas[i] = rand.nextInt(1000000);
// System.out.println(mas[i]);
// } {

