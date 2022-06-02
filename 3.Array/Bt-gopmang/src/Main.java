import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] arr2 = new int[6];
        int[] arr3 = new int[arr1.length + arr2.length];
        System.out.println("Nhap mang 1: ");
        nhapMang(arr1);
        System.out.println("Nhap mang 2: ");
        nhapMang(arr2);
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length ; i++) {
            arr3[arr1.length + i] = arr2[i];
        }
        System.out.println("Mang 3 la: ");
        xuatMang(arr3);
    }

    public static int[] nhapMang(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("input element: " + i);
            arr[i] = sc.nextInt();
        }
        return arr;

    }
    public static void xuatMang(int[] arr){
        for (int a: arr)
            System.out.print(a + " ");
    }
}

