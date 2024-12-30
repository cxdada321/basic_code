package test;

import domain2.Teacher;

public class Test {
    public static void main(String[] args) {
       /* //创建对象
        Student s = new Student("张三", 23);
        System.out.println(s.getName() + "..." + s.getAge());*/

        //要用其他包里的类
        domain.Teacher t = new domain.Teacher();
        domain2.Teacher t2 = new domain2.Teacher();
    }
}
