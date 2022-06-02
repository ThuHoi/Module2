import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 8, 9};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the index want to add: ");
        int index = scanner.nextInt();
        System.out.println("Enter the number want to add: ");
        int element = scanner.nextInt();
        System.out.println("Mảng ban đầu: ");
        xuatMang(arr);
        System.out.println("Mảng sau khi thêm: ");
        arr = addElement(index, element, arr);
        xuatMang(arr);

    }


    public static int[] addElement(int index, int element, int[] arr) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < newArr.length; i++) {
            if (i < index) {
                newArr[i] = arr[i];
            } else if (i == index) {
                newArr[i] = element;
            } else {
                newArr[i] = arr[i - 1];
            }
        }
        return newArr;
    }

    public static void xuatMang(int[] arr) {
        for (int a : arr)
            System.out.print(a + "  ");
        System.out.println("\n");
    }

}


