import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println("Nhập : ");
        nhapMang(arr);
        xuatMang(arr);
        System.out.println("Giá trị nhỏ nhất trong mảng : " + findMin(arr));

    }

    public static int[] nhapMang(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("input element: " + i);
            arr[i] = sc.nextInt();

        }
        return arr;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i])
                min = arr[i];
        }
        return min;
    }

    public static void xuatMang(int[] arr) {
        for (int a : arr)
            System.out.print(a + " ");
    }
}