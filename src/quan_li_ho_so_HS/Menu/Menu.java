package quan_li_ho_so_HS.Menu;

import quan_li_ho_so_HS.Manager.StudentMangement;
import quan_li_ho_so_HS.Student.Student;

import java.util.Scanner;

public class Menu {
    private StudentMangement studentMangement = new StudentMangement();
    private Scanner sc = new Scanner(System.in);

    public int checkInput() {
        int input;
        while (true) {
            try {
                input = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Input phai la dang so");
            }
        }
        return input;
    }

    public void mainMenu() {
        int choice = -1;
        do {
            System.out.println("-----Menu-----\n" +
                    "1.Them hoc sinh\n" +
                    "2.Sua thong tin\n" +
                    "3.Xoa hoc sinh\n" +
                    "4.Tim kiem theo ten\n" +
                    "5.Hien thi danh sach\n" +
                    "0.Thoat chuong trinh");
            choice = checkInput();
            switch (choice) {
                case 1:
                    showMenuAdd();
                    break;
                case 2:
                    showMenuEdit();
                    break;
                case 3:
                    showDeleteStudent();
                    break;
                case 4:
                    searchStudent();
                    break;
                case 5:
                    showAll();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Lua chon khong hop le");
            }
        }
        while (choice != 0);
    }

    public void showMenuAdd() {
        System.out.println("Nhap ten: ");
        String name = sc.nextLine();
        System.out.println("Nhap id: ");
        String id = sc.nextLine();
        System.out.println("Nhap dia chi: ");
        String address = sc.nextLine();
        System.out.println("Nhap tuoi:");
        int age = checkInput();
        Student student = new Student(id, name, age, address);
        studentMangement.add(student);
    }

    public void showMenuEdit() {
        System.out.println("Nhap id can sua:");
        String id = sc.nextLine();
        if (studentMangement.findIndexById(id) == -1) {
            System.out.println("id khong ton tai");
        } else {
            System.out.println("Nhap id moi: ");
            String id1 = sc.nextLine();
            System.out.println("Nhap ten moi: ");
            String name = sc.nextLine();
            System.out.println("Nhap tuoi moi: ");
            int age = checkInput();
            System.out.println("Nhap dia chi moi: ");
            String address = sc.nextLine();
            Student student = new Student(id1, name, age, address);
            studentMangement.edit(id, student);
        }
    }

    public void showDeleteStudent() {
        System.out.println("Nhap id can xoa: ");
        String id = sc.nextLine();
        if (studentMangement.findIndexById(id) == -1) {
            System.out.println("id khong ton tai de xoa");
        } else {
            studentMangement.delete(id);
            System.out.println("Da xoa thanh cong hoc sinh co id: " + id );
        }
    }
    public void searchStudent() {
        System.out.println("Nhap ten hoc sinh can tim: ");
        String name = sc.nextLine();
        studentMangement.findByName(name);
    }
    public void showAll() {
        System.out.println("Danh sach hoc sinh: ");
        System.out.println(studentMangement.getAll());
    }
}
