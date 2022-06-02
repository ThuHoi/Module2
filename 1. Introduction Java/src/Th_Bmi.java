import java.util.Scanner;

public class Th_Bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;

        System.out.print("Your weight (kilogram): ");
        weight = scanner.nextFloat();

        System.out.print("Your height (meter): ");
        height = scanner.nextFloat();

        bmi = weight / Math.pow(height, 2);

        if (bmi < 18)
            System.out.println(bmi + " Underweight");
        else if (bmi < 25.0)
            System.out.println(bmi + "Normal");
        else if (bmi < 30.0)
            System.out.println(bmi + "Overwight");
        else
            System.out.println(bmi + "Obese");
    }
}
