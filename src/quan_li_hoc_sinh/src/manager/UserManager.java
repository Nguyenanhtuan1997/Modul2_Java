package manager;

import model.User;

import java.util.ArrayList;

public class UserManager {
    public ArrayList<User> users = new ArrayList<>();

    public UserManager() {
    }


    public void register(User user) {
        if (users.size() == 0) {
            users.add(user);
            System.out.println("Đăng ký thành công");
        } else {
            for (int i = 0; i < users.size(); i++) {
                if (users.get(i).getNameUser().equals(user.getNameUser()) && users.get(i).getPassword().equals(user.getPassword())) {
                    System.out.println("đăng ký thành công !");
                    users.add(user);
                } else {
                    System.out.println("đăng ký thất bại !");
                }
            }
        }
    }
}

