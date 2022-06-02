package triangle;

import java.util.Scanner;

public class MainTriangle {
    public static void main(String[] args) {
        MyTriangle myTriangle = new MyTriangle();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài cạnh 1: ");
        double canh1 = scanner.nextDouble();
        System.out.println("Nhập độ dài cạnh 2: ");
        double canh2 = scanner.nextDouble();
        System.out.println("Nhập độ dài cạnh 3: ");
        double canh3 = scanner.nextDouble();
        myTriangle.getPerimeter();
        System.out.println(myTriangle);
        myTriangle.getArea();
        System.out.println(myTriangle);
        System.out.println(myTriangle.toString());
    }
}
