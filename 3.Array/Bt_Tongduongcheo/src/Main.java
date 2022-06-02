import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[][] arr = new double[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        double sum = 0;
        double count = 0;
        for (int i = 0; i < arr.length; i++) {
                sum += arr[i][i];
                count++;
        }
        System.out.println("Tổng các số ở đường chéo chính là = " + sum);
    }
}

