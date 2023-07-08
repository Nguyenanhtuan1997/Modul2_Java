package menu;

import manager.ClassManagement;
import manager.StudentManagement;
import model.ClassRoom;
import model.Student;

import java.util.Scanner;

public class MenuAdmin {
    private StudentManagement studentManagement = new StudentManagement();
    private ClassManagement classManagement = new ClassManagement();
    private Scanner scanner = new Scanner(System.in);

    public int checkInput() {
        int input;
        while (true) {
            try {
                input = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Yêu cầu nhập phải là dạng số. Yêu cầu nhập lại:  ");
            }
        }
        return input;
    }

    public void mainMenu() {
        int choice = 0;
        do {
            System.out.println("==============MENU QUẢN LÝ===========\n" +
                    "1.Thêm lớp học.\n" +
                    "2.Xóa lớp học theo id.\n" +
                    "3.Cập nhập thông tin lớp\n" +
                    "4.Tìm kiếm lớp theo tên\n" +
                    "5.Hiển thị danh sách lớp\n" +
                    "6.Thông tin học sinh.\n" +
                    "0.Thoát");
            System.out.println("Vui lòng chọn ! : ");
            System.out.println("------------------------------------------------------------");

            choice = checkInput();
            switch (choice) {
                case 1:
                    showMenuAddClass();
                    break;
                case 2:
                    showDeleteClass();
                    break;
                case 3:
                    showMenuEditClass();
                    break;
                case 4:
                    searchClass();
                    break;
                case 5:
                    showAll();
                    break;
                case 6:
                    showMenuStuden();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Lựa chọn của bạn không hợp lệ. Vui lòng nhập lại !");
            }
        }
        while (choice != 0);
    }

    public void showMenuAddClass() {
        System.out.println("Nhập tên lớp : ");
        String name = scanner.nextLine();
        System.out.println("Nhập mã id lớp : ");
        String id = scanner.nextLine();
        ClassRoom classRoom = new ClassRoom(id, name);
        classManagement.add(classRoom);
    }


    public void showMenuEditClass() {
        System.out.println("Nhập id lớp cần sửa: ");
        String id = scanner.nextLine();
        if (classManagement.findIndexById(id) == -1) {
            System.out.println("id này không tồn tại !");
        } else {
            System.out.println("Nhập id mới của lớp : ");
            String id1 = scanner.nextLine();
            System.out.println("Nhập tên mới của lớp : ");
            String name = scanner.nextLine();
            ClassRoom classRoom = new ClassRoom(id, name);
            classManagement.edit(id, classRoom);
        }
    }

    public void showDeleteClass() {
        System.out.println("Nhập id lớp cần xóa: ");
        String id = scanner.nextLine();
        if (classManagement.findIndexById(id) == -1) {
            System.out.println("id không tồn tại để xóa !");
        } else {
            classManagement.delete(id);
            System.out.println("Đã xóa thành công lớp có id: " + id);
        }
    }

    public void searchClass() {
        System.out.println("Nhập tên lớp muốn tìm kiếm: ");
        String name = scanner.nextLine();
        classManagement.findByName(name);
    }

    public void showAll() {
        System.out.println("=========DANH SÁCH LỚP=========");
        System.out.println(classManagement.getAll());
        System.out.println("---------------------------------------------------------");
    }

    public void showMenuStuden() {
        int choice1 = 0;
        do {
            System.out.println("==============QUẢN LÝ HỌC SINH===========\n" +

                    "1.Thêm học sinh\n" +
                    "2.Xóa học sinh theo id\n" +
                    "3.Cập nhập thông tin học sinh\n" +
                    "4.Tìm kiếm học sinh theo tên\n" +
                    "5.Hiển thị danh sách học sinh\n" +
                    "0.Thoát");
            System.out.println("Vui lòng chọn ! : ");
            System.out.println("------------------------------------------------------------");

            choice1 = checkInput();
            switch (choice1) {
                case 1:
                    showMenuAddStudent();
                    break;
                case 2:
                    showDeleteStudent();
                    break;
                case 3:
                    showMenuEditStudent();
                    break;
                case 4:
                    searchStudent();
                    break;
                case 5:
                    showAllStudent();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Lựa chọn của bạn không hợp lệ. Vui lòng nhập lại !");
            }
        }
        while (choice1 != 0);
    }

    public void showMenuAddStudent() {
        System.out.println("Nhập tên học sinh : ");
        String name = scanner.nextLine();
        System.out.println("Nhập mã id học sinh : ");
        String id = scanner.nextLine();
        System.out.println("Nhập tuổi học sinh : ");
        int age = checkInput();
        System.out.println("Nhập quê quán : ");
        String address = scanner.nextLine();
        Student student = new Student(id, name, age, address);
        studentManagement.add(student);
    }

    public void showDeleteStudent() {
        System.out.println("Nhập id học sinh cần xóa: ");
        String id = scanner.nextLine();
        if (studentManagement.findIndexById(id) == -1) {
            System.out.println("id không tồn tại để xóa !");
        } else {
            studentManagement.delete(id);
            System.out.println("Đã xóa thành công học sinh có id: " + id);
        }
    }

    public void showMenuEditStudent() {
        System.out.println("Nhập id học sinh cần sửa: ");
        String id = scanner.nextLine();
        if (studentManagement.findIndexById(id) == -1) {
            System.out.println("id này không tồn tại !");
        } else {
            System.out.println("Nhập id mới của học sinh : ");
            String id1 = scanner.nextLine();
            System.out.println("Nhập tên mới của học sinh : ");
            String name = scanner.nextLine();
            System.out.println("Nhập tuổi mới của học sinh: ");
            int age = checkInput();
            System.out.println("Nhập quê quán mới của học sinh: ");
            String address = scanner.nextLine();
            Student student = new Student(id, name, age, address);
            studentManagement.edit(id, student);
        }
    }

    public void searchStudent() {
        System.out.println("Nhập tên học sinh muốn tìm kiếm: ");
        String name = scanner.nextLine();
        studentManagement.findByName(name);
    }

    public void showAllStudent() {
        System.out.println("=========DANH SÁCH HỌC SINH=========");
        System.out.println(studentManagement.getAll());
        System.out.println("---------------------------------------------------------");
    }
}


