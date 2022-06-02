package baitap.insertSort;

public class Insert {
    static int[] arr = {2, 6, 3, 1, 5, 4, 8};


    public void insertSort(int[] list) {


        for (int i = 1; i < list.length; i++) {

            int currentElement = list[i];
            int j;
            for (int j = i - 1; j >= 0 && list[j] > currentElement; j--) {

                list[j + 1] = list[j];
            }
            list[j + 1] = currentElement;
        }
    }

    public static void main(String[] args) {
        insertSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");

        }
    }
}
