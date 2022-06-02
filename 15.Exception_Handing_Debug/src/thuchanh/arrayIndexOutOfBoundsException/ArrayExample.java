package thuchanh.arrayIndexOutOfBoundsException;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] creatRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Array List: ");
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        return arr;

        }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.creatRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPlease enter the index of any number of elements: ");
        int x = scanner.nextInt();
        try {
            System.out.println("The value of the element with index 5" + x + " is " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index exceeds the limit of the array!");
        }
    }


}
