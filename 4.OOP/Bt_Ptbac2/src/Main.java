import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        System.out.print("Nhập a,b,c");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();


        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        quadraticEquation.result();


    }
}
