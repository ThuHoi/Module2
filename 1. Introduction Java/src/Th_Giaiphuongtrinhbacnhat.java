import java.util.Scanner;

public class Th_Giaiphuongtrinhbacnhat {
    public static void main(String[] args) {
        System.out.println("Giai pt bac nhat");
        Scanner scanner = new Scanner(System.in);

        float a,b;
        System.out.println("Enter a: ");
        a = scanner.nextFloat();
        System.out.println("Enter b: ");
        b = scanner.nextFloat();

        if (a ==0 && b ==0) {
            System.out.println("Phương trình vô số nghiệm");
        } else if (a !=0 && b ==0){
            System.out.println("Phương trình có nghiệm x = 0");
        } else if (a==0 && b !=0) {
            System.out.println("Phương trình vô nghiệm");
        } else {
            System.out.println("Phương trình có nghiệm x= " + (-b/a));
        }
    }
}
