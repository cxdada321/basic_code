package hust.edu.myset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class HarshSetDemo1 {
    public static void main(String[] args) {
        /*创建一个存储学生对象的集合
        * 遍历该集合
        * 要求：学生对象的成员变量值相同是就认为是同一个对象*/
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("张三", 23);
        Student s2 = new Student("李四", 24);
        Student s3 = new Student("王五", 25);
        Student s4 = new Student("张三", 23);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        HashSet<Student> set = new HashSet<>();
        for (Student student : list) {
            set.add(student);
        }
        set.forEach(student -> System.out.println(student));
    }
}

class Student{
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}