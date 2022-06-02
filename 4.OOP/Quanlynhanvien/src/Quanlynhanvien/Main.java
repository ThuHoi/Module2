package Quanlynhanvien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Nhanvien[] arr = new Nhanvien[3];
        Scanner scanner = new Scanner(System.in);

        int choice = -1;
        choice = scanner.nextInt();
        while (choice != 0)
            show();
        switch (choice) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
        }
    }

    public static void show() {
        System.out.println("==== Menu ====");
        System.out.println("| 1. Add ");
        System.out.println("| 2. Edit ");
        System.out.println("| 3. Edete ");
        System.out.println("| 4. Show ");
        System.out.println("| 5. Exit ");

        System.out.println("Enter your choice: ");
    }

    static Nhanvien[] add(Nhanvien A, Nhanvien[] arr) {
        Nhanvien[] newArr = new Nhanvien[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[arr.length] = A;
        return newArr;

    }



}


