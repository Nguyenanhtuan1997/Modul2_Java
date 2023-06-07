package $3_mang_phuong_thuc_mang;

import java.util.Scanner;

public class tim_Min_trong_mang {
    public static void main(String[] args) {
        int SIZE = 5; // số phần tử mảng
        int[] arr = new int[SIZE];

        Scanner input = new Scanner(System.in);
        System.out.println("nhập " + SIZE + " phần tử mảng");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("phần tử thứ " + (i + 1) + ":");
            arr[i] = input.nextInt();
        }

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("giá trị nhỏ nhất là: " + min);
    }

}
