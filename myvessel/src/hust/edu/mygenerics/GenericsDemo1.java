package hust.edu.mygenerics;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsDemo1 {
    public static void main(String[] args) {
        //没有泛型，集合如何存储数据
        //1.创建集合对象
        ArrayList list = new ArrayList();

        String stu = "11";
        Integer i = Integer.parseInt(stu);
        System.out.println(i);


        //2.添加元素
        list.add("abc");
        list.add(100);
        list.add(12.34);
        list.add(new Student("张三", 23));

        Iterator it = list.iterator();
        while(it.hasNext()) {
            //多态的弊端不能访问子类特有的方法
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}

class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
