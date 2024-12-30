package test.test2;

import test.test1.Student;

import java.util.ArrayList;

import java.util.Scanner;

public class StuScannerTest {
    public static void main(String[] args) {
        /*定义一个集合，添加一些学生对象，并进行遍历
         * 姓名，年龄
         * 键盘录入*/
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        boolean flag = true;
        int count = 0;
        //添加学生元素
        while (flag) {
            Student stu = new Student();
            //list.add(stu);
            System.out.println("请输入学生姓名：");
            stu.setName(sc.next());
            System.out.println("请输入学生年龄：");
            stu.setAge(sc.nextInt());
            //list.set(count, stu);
            list.add(stu);
            System.out.println("是否继续录入？(y/n)");
            String str = sc.next();
            if (str.equals("n")) {
                flag = false;
            } else {
                count++;
            }

        }
        for (int i = 0; i < list.size(); i++) {
            //学生对象
            Student stu = list.get(i);
            System.out.printf("姓名：%s，年龄：%d", stu.getName(), stu.getAge());
            System.out.println();
        }
    }
}
