package $2_Vonglap_trongJava;
import java.util.Scanner;

public class tien_Lai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng tiền cho vay: ");
        double loanAmount = scanner.nextDouble();

        System.out.print("Nhập tỉ lệ lãi suất hàng tháng (%): ");
        double interestRate = scanner.nextDouble();

        System.out.print("Nhập số tháng cho vay: ");
        int loanDurationMonths = scanner.nextInt();

        double totalInterest = loanAmount * interestRate / 12 / 100 * loanDurationMonths;
        double totalAmount = loanAmount + totalInterest;

        System.out.println("Tổng số tiền có được khi hết thời hạn cho vay là: " + totalAmount);
    }
}
