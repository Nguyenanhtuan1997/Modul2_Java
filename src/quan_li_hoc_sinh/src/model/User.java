package model;

import java.util.Scanner;

public class User {
    private String nameUser;
    private String password;

    public User(String nameUser, String password) {
        this.nameUser = nameUser;
        this.password = password;

    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }





    public void inputUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập tên đăng nhập: ");
        this.nameUser = scanner.nextLine();

        System.out.println("Nhập mật khẩu: ");
        this.password = scanner.nextLine();
    }
    public void showUser() {
        System.out.println("Tên đăng nhập: " + this.nameUser);
        System.out.println("Mật khẩu: " + this.password);
    }
}
