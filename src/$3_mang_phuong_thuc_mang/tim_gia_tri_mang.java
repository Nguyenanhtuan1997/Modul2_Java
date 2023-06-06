package $3_mang_phuong_thuc_mang;

import java.util.Scanner;

public class tim_gia_tri_mang {
    public static void main(String[] args) {
        // Bước 4: Khai báo mảng chứa danh sách sinh viên
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};

        // Bước 5: Khai báo biến lưu tên tìm kiếm và gán với giá trị nhập vào
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a student's name: ");
        String inputName = scanner.nextLine();

        // Bước 6: Duyệt mảng sinh viên đã khai báo ở trên, tìm phần tử có giá trị bằng với tên đã nhập vào.
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(inputName)) {
                System.out.println("Position of the student in the list, " + inputName + ", is: " + i);
                isExist = true;
                break;
            }
        }

        if (!isExist) {
            System.out.println("Not found " + inputName + " in the list.");
        }
    }
}
