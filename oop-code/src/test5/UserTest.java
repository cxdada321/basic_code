package test5;

import test4.Student;

public class UserTest {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        User user = new User();
        System.out.println("请输入姓名：");
        user.setName(sc.next());
        System.out.println("姓名：" + user.getName());
    }
}
