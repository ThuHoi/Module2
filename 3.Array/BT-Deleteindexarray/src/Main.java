import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int arr[] = {1, 5, 7, 3, 7, 4};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number want to delete: ");
        int deleteNum = scanner.nextInt();
        int deletePosition = findIndex(arr, deleteNum);

        if (deletePosition == -1) {
            System.out.println("Index not in Array");
        } else {
            arr = deleteAindex(arr, deletePosition);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "");
        }
    }

    static int findIndex(int[] arr, int index) {
        int position = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == index) {
                position = i;
            }
        }
        return position;
    }

    static int[] deleteAindex(int[] arr, int position) {
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < position; i++) {
            newArr[i] = arr[i];
        }

        for (int i = position + 1; i < arr.length; i++) {
            newArr[i - 1] = arr[i];
        }
        return newArr;
    }

}

