package $3_mang_phuong_thuc_mang;

import java.util.Arrays;
import java.util.Scanner;

public class gop_Mang {
    public static void main(String[] args) {
        // Bước 1: Tạo 2 mảng số với kích thước cho trước
        int[] array1 = new int[5];
        int[] array2 = new int[3];

        // Bước 2: Nhập giá trị cho các phần tử trong mảng 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị cho mảng 1:");
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Nhập giá trị phần tử thứ " + i + ": ");
            array1[i] = scanner.nextInt();
        }

        // Bước 2: Nhập giá trị cho các phần tử trong mảng 2
        System.out.println("Nhập giá trị cho mảng 2:");
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Nhập giá trị phần tử thứ " + i + ": ");
            array2[i] = scanner.nextInt();
        }

        // Bước 3: Tạo mảng thứ 3 có kích thước bằng kích thước mảng 1 + kích thước mảng 2
        int[] array3 = new int[array1.length + array2.length];

        // Bước 4: Gộp mảng 1 và mảng 2 vào mảng thứ 3
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }

        // Bước 5: Gán các phần tử của mảng 2 vào mảng thứ 3, bắt đầu từ vị trí array1.length
        for (int i = 0; i < array2.length; i++) {
            array3[array1.length + i] = array2[i];
        }

        // In ra mảng thứ 3 đã gộp
        System.out.println("Mảng sau khi gộp:");
        System.out.println(Arrays.toString(array3));
    }
}
