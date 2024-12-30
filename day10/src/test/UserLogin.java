package test;

public class UserLogin {
    /*已知正确的用户名和密码，请用程序实现模拟用户登录
    * 总共三次机会，登录之后，给出相应提示*/
    public static void main(String[] args) {
        User user = new User("admin", "HEllo123456");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名：");
            String userid = sc.next();
            System.out.println("请输入密码：");
            String password = sc.next();
            if (userid.equalsIgnoreCase(user.getUserid()) && password.equalsIgnoreCase(user.getPassword())) {
                System.out.println("登录成功！");
                break;
            } else {
                System.out.println("登录失败！");
                System.out.println("还有" + (2 - i) + "次机会！");
            }
        }
        
    }


}
