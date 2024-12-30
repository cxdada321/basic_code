package hust.edu.myset;

import java.util.Objects;
import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        /*添加3个学生对象
        * 按照年龄排序，相同按着名字字母排列，都相同认为是一个人
        *
        * 方式1：默认排序
        * Student1里实现Comparable接口，重写方法*/
        TreeSet<Student1> set = new TreeSet<>();
        Student1 s1 = new Student1("abb", 23);
        Student1 s2 = new Student1("ab", 23);
        Student1 s3 = new Student1("cbb", 25);
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.forEach(student1 -> System.out.println(student1));
    }
}

class Student1 implements Comparable{
    private String name;
    private int age;

    public Student1() {
    }

    public Student1(String name, int age) {
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
        return "Student1{name = " + name + ", age = " + age + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student1 student1 = (Student1) o;
        return age == student1.age && Objects.equals(name, student1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }


    @Override
    public int compareTo(Object o) {
        //指定排序规则
        if (this.age == ((Student1)o).age) {
            return this.name.compareTo(((Student1)o).name);//this表明当前要添加的元素，o表明已经添加的元素
        }
        return this.age - ((Student1)o).age;//正数表明大，放在后面这里this相当于无序值o1，o相当于有序值o2
    }
}


