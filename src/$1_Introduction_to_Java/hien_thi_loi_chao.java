package $1_Introduction_to_Java;

import java.util.Scanner;

public class hien_thi_loi_chao {
    public static void main(String[] args) {
        // Tạo một đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Yêu cầu người dùng nhập tên
        System.out.println("nhap ten: ");
        String name = scanner.nextLine();

        // Hiển thị lời chào kèm theo tên của người dùng
        System.out.println("Hello, " + name + "!");
    }
}
