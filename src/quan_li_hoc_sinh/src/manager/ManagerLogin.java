package manager;

public class ManagerLogin {
    UserManager userManager;
   public ManagerLogin(UserManager userManager){

       this.userManager= userManager;
    }

    public boolean isLogin(String userName, String password) {
        for (int i = 0; i < userManager.users.size(); i++) {
            if (userManager.users.get(i).getNameUser().equals(userName) &&
                    userManager.users.get(i).getPassword().equals(password)) {
                System.out.println("Đăng nhập thành công !");
                return true;
            }
        }
        System.out.println("Đăng nhập thất bại !");
        return false;
    }
}
