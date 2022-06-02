import java.util.Scanner;

public class Bt_Hienthiloichao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        //Phương thức nextLine() trong của đối tượng Scanner dùng để nhận vào một dòng
        // String nhập từ bàn phím, kết thúc khi thấy dấu xuống dòng.
        System.out.println("Hello:" + name);
    }
}
