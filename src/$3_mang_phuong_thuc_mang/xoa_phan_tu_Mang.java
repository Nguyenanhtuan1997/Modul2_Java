package $3_mang_phuong_thuc_mang;
import java.util.Scanner;
public class xoa_phan_tu_Mang {
    public static void main(String[] args) {
        // Bước 1: Khai báo và khởi tạo mảng số nguyên gồm N phần tử cho trước
        int[] array = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        int N = array.length;

        // Bước 2: Nhập X là phần tử cần xoá
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập phần tử cần xoá: ");
        int X = scanner.nextInt();

        // Bước 3: Tìm X xem có xuất hiện trong mảng không và lấy vị trí của X
        int indexDel = -1; // Vị trí của phần tử cần xoá, khởi tạo mặc định là -1 (không tồn tại)
        for (int i = 0; i < N; i++) {
            if (array[i] == X) {
                indexDel = i;
                break;
            }
        }

        if (indexDel != -1) {
            // Bước 4: Xoá phần tử X khỏi mảng
            for (int i = indexDel; i < N - 1; i++) {
                array[i] = array[i + 1];
            }
            array[N - 1] = 0; // Ghi đè phần tử cuối cùng bằng 0

            // Bước 5: In ra mảng sau khi xoá
            System.out.println("Mảng sau khi xoá:");
            for (int i = 0; i < N - 1; i++) {
                System.out.print(array[i] + " ");
            }
        } else {
            System.out.println("Phần tử " + X + " không xuất hiện trong mảng.");
        }
    }
}

