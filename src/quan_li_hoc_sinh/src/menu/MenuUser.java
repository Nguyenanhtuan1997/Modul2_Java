package menu;

import manager.Management;
import manager.ManagerLogin;
import manager.UserManager;
import model.User;

import java.util.Scanner;

public class MenuUser {
    MenuAdmin menuAdmin = new MenuAdmin();
    Scanner scanner = new Scanner(System.in);
    UserManager userManager = new UserManager();
    ManagerLogin managerLogin = new ManagerLogin(userManager);

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("=======Home========");
            System.out.println("1.Đăng nhập\n" + "2.Đăng ký");
            System.out.println("Nhập lựa chọn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    login();
                    break;
                case 2:
                    register();
                    break;
                default:
                    System.out.println("Nhập lựa chọn sai !");
                    break;
            }
        } while (choice != 0);

    }
    public void login() {
        System.out.println("Nhập tên tài khoản: ");
        String accountName = scanner.nextLine();
        System.out.println("Nhập mật khẩu: ");
        String password = scanner.nextLine();
        if(managerLogin.isLogin(accountName, password)){
            menuAdmin.mainMenu();
        }
    }

    public void register() {
        System.out.println("Nhập tên đăng ký: ");
        String user = scanner.nextLine();
        System.out.println("Nhập mật khẩu: ");
        String password = scanner.nextLine();
        User user1 = new User(user,password);
        userManager.register(user1);
    }

}
