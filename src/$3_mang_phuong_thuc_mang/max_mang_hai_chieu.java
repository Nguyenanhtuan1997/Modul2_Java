package $3_mang_phuong_thuc_mang;

import java.util.Scanner;

public class max_mang_hai_chieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Đầu tiên yêu cầu ng dùng nhập số lượng hàng và cột
        System.out.println("nhập hàng của ma trận:");
        int rows = sc.nextInt();
        System.out.println("nhập số cột của ma trận");
        int cols = sc.nextInt();

        // tạo một ma trận 2 chiều để lưu giá trị đc nhập vào
        double[][] matrix = new double[rows][cols];

        // thực hiện phần nhập liệu.
        System.out.println("Hãy nhập giá trị cho các phần tử của ma trận");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("nhập giá trị cho phần tử [%d, %d]:", i, j);
                matrix[i][j] = sc.nextDouble();
            }
        }

        // khai báo giá trị lớn nhất có thể dc tìm thấy và vị tr của nó.
        double max = matrix[0][0];
        int maxRow = 0, maxCol = 0;

        // Duyệt qua tất cả các phần tử của ma trận và tìm phần tử có giá trị lớn nhất
        // tại vị trí có tọa độ là (maxRow, maxCol).
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        // Xuất kết quả cho người dùng.
        System.out.printf("Phần tử lớn nhất trong ma trận là %.2f, với tọa độ [%d, %d].", max, maxRow, maxCol);
    }
}
