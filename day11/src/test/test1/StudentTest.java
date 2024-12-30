package test.test1;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        /*定义一个集合，添加一些学生对象，并进行遍历
        * 姓名，年龄*/
        Student stu1 = new Student("张三", 23);
        Student stu2 = new Student("李四", 24);
        Student stu3 = new Student("王五", 25);
        //创建集合
        ArrayList<Student> list = new ArrayList<>();
        //添加元素
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        for (int i = 0; i < list.size(); i++) {
            //学生对象
            Student stu = list.get(i);
            System.out.printf("姓名：%s，年龄：%d", stu.getName(), stu.getAge());
            System.out.println();
        }
    }
}
