package thuchanh.searchAlgorithm;

import java.util.Scanner;

public class BinarySearch {
    static int[] list = {2, 4, 7, 9, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

//    static int binarySearch(int[] list, int key) {
//int low =0;
//int high= list.length -1;
//        while (high >= low) {
//            int mid = (low + high) / 2;
//            if (key < list[mid])
//                high = mid - 1;
//            else if (key == list[mid]) {
//                return mid;
//            } else {
//                low = mid + 1;
//            }
//        }
//        return -1;
//    }
//
//    ;

    static int binaryCheck(int[] list, int key, int low, int high) {

        if (high >= low) {
            int mid = low + (high - low) / 2;
            if (list[mid] == key) {
                return mid;
            } else if (list[mid] > key)
                return binaryCheck(list, key, low, mid - 1);
            else {
                return binaryCheck(list, key, mid + 1, high);
            }
        } else
            return -1;
    }

    public static void main(String[] args) {
        System.out.println(BinarySearch.binaryCheck(list, 10, 0, list.length - 1));


    }
}





