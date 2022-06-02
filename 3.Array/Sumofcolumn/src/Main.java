import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[][] arr = new double[][]{{1, 2, 3}, {4, 5, 6}};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cột muốn tính : ");
        int colum = scanner.nextInt();

        double sum = 0;
        double count = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][colum];

            count++;
        }
        System.out.println("Tổng các phần tử ở cột thứ " + colum + " = " + sum);

    }
}
