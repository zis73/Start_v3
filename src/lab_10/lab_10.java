package lab_10;

import java.util.Random;
import java.util.Scanner;

public class lab_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введи длину массива: ");
        int n = scan.nextInt();

        int[] arr = new int[n];

        RandomInit(arr, n);
        PrintArr(arr, n);
        Merge(arr);

        System.out.println("------");

        System.nanoTime();
        long MergeSort = System.nanoTime();
    }


    public static int[] Merge(int[] arr) {
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
        MergeSort(arr,first,second);
        return arr;
    }

    public static void RandomInit(int[] arr, int n) {
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(1000000);
        }
    }

    public static void MergeSort(int[] arr, int[] first, int[] second) {
        int a = 0;
        int f = 0;
        int s = 0;
        while (f < first.length && s < second.length) {
            if (second[s] < first[f]){
                arr[a] = second[s];
                s++;
            }else {
                arr[a] = first[f];
                f++;
            }
            a++;
        }
    }

    static void PrintArr(int[] arr, int n) {
        int b = 0;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();

    }
}


// int[] mas = new int[100];
// for (int i = 0; i < mas.length; i++) {
// Random rand = new Random();
// mas[i] = rand.nextInt(1000000);
// System.out.println(mas[i]);
// } {

