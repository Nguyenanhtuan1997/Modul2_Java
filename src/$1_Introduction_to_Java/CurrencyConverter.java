package $1_Introduction_to_Java;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        // Bước 1: Tạo dự án mới và khai báo hàm main()

        // Bước 2: Khai báo biến tỉ giá (rate) để lưu giá trị tỉ giá giữa VND và USD
        double rate = 23000;

        // Bước 3: Khai báo biến giá trị USD và cho người dùng nhập vào
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá trị USD: ");
        double usdValue = scanner.nextDouble();

        // Bước 4: Tính giá trị VND và hiển thị ra màn hình
        double vndValue = usdValue * rate;
        System.out.println("Giá trị tương ứng của " + usdValue + " USD là " + vndValue + " VND.");

        scanner.close();
    }
}
