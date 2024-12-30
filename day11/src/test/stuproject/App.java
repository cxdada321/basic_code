package test.stuproject;


import java.util.ArrayList;
import java.util.Scanner;

public class App {
    //初始化用户信息
    static ArrayList<UserInfo> list = new ArrayList<>();
    static {
        list.add(new UserInfo("admin", "admin", "123456789012345678", "12345678901"));
    }
    public static void main(String[] args) {
        //登录界面
        System.out.println("欢迎使用学生管理系统");
        System.out.println("1.登录");
        System.out.println("2.注册");
        System.out.println("3.忘记密码");
        loop: while (true) {
            System.out.println("请选择要进行的操作：");
            int select = new Scanner(System.in).nextInt();
            switch (select) {
                case 1: {
                    //登录
                    login(list);
                    break;
                }
                case 2: {
                    //注册
                    register(list);
                    break;
                }
                case 3: {
                    //忘记密码
                    forgetPassword(list);
                    break;
                }
                default: {
                    System.out.println("输入有误，请重新输入");
                    break loop;
                }
            }
        }
    }
    public static void login(ArrayList<UserInfo> list) {
        UserInfo user = new UserInfo();
        System.out.println("请输入用户名：");
        user.setUsername(new Scanner(System.in).next());
        if (list.size() == 0) {
            System.out.println("用户名不存在，请注册");
        } else if (list.size() > 0){
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getUsername().equals(user.getUsername())) {
                    System.out.println("请输入密码：");
                    user.setPassword(new Scanner(System.in).next());
                    while (true) {
                        String authcode = authCode();
                        System.out.println("验证码为" + authcode);
                        System.out.println("请输入验证码：");
                        String code = new Scanner(System.in).next();
                        for (int j = 0; j < 3; j++) {
                            if (code.equalsIgnoreCase(authcode)) {
                                if (list.get(i).getPassword().equals(user.getPassword())) {
                                    System.out.println("登陆成功");
                                    //创建对象调用方法，启动学生管理系统
                                    StuInfoConsole stu = new StuInfoConsole();
                                    stu.studentSystem();
                                    //break loop; 用app控制console
                                    System.exit(0);
                                } else {
                                    System.out.println("密码错误，请重新输入");
                                    user.setPassword(new Scanner(System.in).next());
                                }
                            } else {
                                System.out.println("验证码错误，请重新输入");
                                code = new Scanner(System.in).next();
                            }
                        }
                        System.out.println("多次错误，退出");
                        break;
                    }
                }
            }
        } else {
            System.out.println("用户名不存在，请注册");
        }
    }

    public static void register(ArrayList<UserInfo> list) {
        UserInfo user = new UserInfo();
        boolean flag = true;
        System.out.println("请输入您的用户名：");
        while (flag) {
            user.setUsername(new Scanner(System.in).next());
            //验证用户名是否唯一
            flag = contain(user, list);
            //验证用户名长度
            if (user.getUsername().length() < 3 || user.getUsername().length() > 15) {
                System.out.println("用户名长度不符合要求，请重新输入");
                flag = true;
            } else if (vertify(user, user.getUsername(), 3)){
                flag = true;
                System.out.println("用户名只能为字母或者数字，请重新输入");
                //验证用户名是否只为字母和数字，且不全为数字或者字母
            } else if (vertify(user, user.getUsername(), 1)) {
                flag = true;
                System.out.println("用户名不能全为数字或者字母，请重新输入：");
            }
        }
        while (true) {
            System.out.println("请输入您的密码：");
            user.setPassword(new Scanner(System.in).next());
            System.out.println("请再次输入您的密码：");
            String password = new Scanner(System.in).next();
            if (user.getPassword().equals(password)) {
                break;
            } else {
                System.out.println("两次密码不一致");
            }
        }
        System.out.println("请输入您的身份证号：");
        while (true) {
            user.setCetificationid(new Scanner(System.in).next());
            if (user.getCetificationid().charAt(0) == '0') {
                System.out.println("身份证号不能以0开头，请重新输入：");
            } else if (user.getCetificationid().length() != 18) {
                System.out.println("身份证号长度不符合要求，请重新输入：");
            } else if (vertify(user, user.getCetificationid().substring(0,17), 2)) {
                System.out.println("身份证号前17位只能是数字，请重新输入：");
            } else if ((user.getCetificationid().charAt(17) >= '0' && user.getCetificationid().charAt(17) <= '9') ||
                    user.getCetificationid().charAt(17) == 'X' || user.getCetificationid().charAt(17) == 'x') {
                break;
            } else {
                System.out.println("身份证号最后一位只能是数字或者X和x，请重新输入：");
            }
        }
        System.out.println("请输入您的电话：");
        while (true) {
            user.setTelnumber(new Scanner(System.in).next());
            StringBuilder str = new StringBuilder();
            str.append(user.getTelnumber());
            if (str.length() != 11) {
                System.out.println("电话号码长度不符合要求，请重新输入：");
            } else if (str.charAt(0) == '0') {
                System.out.println("电话号码不能以0开头，请重新输入：");
            } else if (vertify(user, str.toString(), 2)){
                System.out.println("电话号码只能是数字，请重新输入：");
            } else {
                break;
            }
        }
        list.add(user);
        System.out.println("恭喜您注册成功！");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getUsername() + " " + list.get(i).getPassword() + " " + list.get(i).getCetificationid() + " " + list.get(i).getTelnumber());
        }
    }

    public static void forgetPassword(ArrayList<UserInfo> list) {
        boolean flag = false;
        int index = 0;
        UserInfo user = new UserInfo();
        System.out.println("请输入您的用户名：");
        user.setUsername(new Scanner(System.in).next());
        for (int i = 0; i < list.size(); i++) {
            if (user.getUsername().equals(list.get(i).getUsername())) {
                System.out.println("当前账户存在");
                flag = true;
                index = i;
                break;
            }
        }
        if (flag) {
            System.out.println("请输入您的身份证号：");
            user.setCetificationid(new Scanner(System.in).next());
            System.out.println("请输入您的电话号码：");
            user.setTelnumber(new Scanner(System.in).next());
            if (list.get(index).getCetificationid().equals(user.getCetificationid()) &&
                list.get(index).getTelnumber().equals(user.getTelnumber())) {
                System.out.println("验证成功，请重新设置密码：");
                list.get(index).setPassword(new Scanner(System.in).next());
            } else {
                System.out.println("验证失败");
            }
            return;
        }
        System.out.println("未注册");
    }
    //验证是否唯一
    public static boolean contain(UserInfo user, ArrayList<UserInfo> list) {
        if (list.size() != 0) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getUsername().equals(user.getUsername())) {
                    System.out.println("用户名重复，请重新输入");
                    return true;
                }
            }
        }
        System.out.println("用户名未重复");
        return false;
    }

    //生成验证码
    public static String authCode() {
        /*内容：可以是小写字母，大写字母，也可以是数字
         * 规则：长度为5
         * 其中四位是字母，一位数字
         * 其中数字只有1位，但是可以出现在任意位置*/
        java.util.Random r = new java.util.Random();
        char[] chs = new char[5];
        int num = r.nextInt(5);
        for (int i = 0; i < 5; i++) {
            if (i == num) {
                chs[i] = (char) (r.nextInt(10) + '0');
            } else {
                int num1 = r.nextInt(2);
                if (num1 == 0) {
                    chs[i] = (char) (r.nextInt(26) + 'a');
                } else {
                    chs[i] = (char) (r.nextInt(26) + 'A');
                }
            }
        }
        return new String(chs);
    }

    public static boolean vertify(UserInfo user, String str, int num) {
        int number = 0;
        int word = 0;
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                number = 1;
                sum++;
            } else if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) {
                word = 1;
                sum++;
            }
        }
        switch (num) {
            case 1: {
                if (number != 1 || word != 1) {
                    //user.setUsername(new Scanner(System.in).next());
                    return true;
                }
                break;
            }
            case 2: {
                if (word == 1) {
                    return true;
                }
                break;
            }
            case 3: {
                if (sum != str.length()) {
                    //user.setUsername(new Scanner(System.in).next());
                    return true;
                }
                break;
            }
        }
        return false;
    }
}
