package $3_mang_phuong_thuc_mang;

import java.util.Scanner;

public class tong_so_o_1_cot {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // hỏi người dùng kích thước mảng
        System.out.print("Nhập số hàng của mảng: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột của mảng: ");
        int cols = scanner.nextInt();

        // tạo mảng bằng kích thước được nhập từ người dùng
        float[][] arr = new float[rows][cols];

        // hỏi người dùng giá trị của từng phần tử trong mảng
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Nhập giá trị tại [" + i + "][" + j + "]: ");
                arr[i][j] = scanner.nextFloat();
            }
        }

        // hỏi người dùng cột muốn tính tổng
        System.out.print("Nhập số cột muốn tính tổng: ");
        int colIndex = scanner.nextInt();

        // tính tổng các phần tử của cột được chỉ định
        float sum = 0;
        for (int i = 0; i < rows; i++) {
            sum += arr[i][colIndex];
        }

        // in ra tổng các phần tử trong cột được chỉ định
        System.out.println("Tổng các phần tử trong cột " + colIndex + " là: " + sum);
    }
}
