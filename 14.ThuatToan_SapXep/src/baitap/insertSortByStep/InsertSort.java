package baitap.insertSort;

import java.util.Scanner;

public class InsertSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter list size: ");
        int size = scanner.nextInt();

        int[] list = new int[size];
        System.out.println("Enter " + list.length + " " + "values: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }

        System.out.println("Your input list: ");
        for (int e : list) {
            System.out.println(e);

        }
        System.out.println("Begin sort processing...");
        insertionSort(list);

    }

    public static void insertionSort(int[] arr) {
        int j, key;
        for (int i = 1; i < arr.length; i++) {
            key = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;


            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }

    }

}

