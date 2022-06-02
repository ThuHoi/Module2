import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] students = {"Hán Tới", "Hồi Thu", "Tình Teng"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name's student: ");
        String input_name = scanner.nextLine();

        boolean check = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Position of the students in the list " + input_name + " is: " + i);
                check = true;
                break;
            }

        }
        if (check) {
            System.out.println("Found " + input_name + " in the list.");
        } else
            System.out.println("Not Found" + input_name + " in the list.");
    }
}
