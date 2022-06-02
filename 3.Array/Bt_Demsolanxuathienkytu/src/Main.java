import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        int count = 0;
        System.out.println("Nhập vào một chuỗi: ");
        str = scanner.nextLine();
        System.out.println("Nhập một ký tự bất kỳ : ");
        char character = scanner.next().charAt(0);

        for (int i = 0; i < str.length(); i++) {
            if (character == str.charAt(i)) {
                count++;
            }
        }
        if (count == 0)
            System.out.println("Ký tự vừa nhập không có trong chuỗi ");
        else
            System.out.println("Ký tự " + character + " " + "xuất hiện " + count +" " + "lần ");
    }
}
