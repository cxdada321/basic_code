package eu.hust.objectdemo.objectsdemo;

import java.util.Objects;

public class ObjectsDemo1 {
    public static void main(String[] args) {
        /*
        * equals 先做非空判断，比较两个对象
        * isNull 判断对象是否为null，为null返回true
        * nonNull 不为null返回true*/

        //比较两个对象属性值是否相同
        Student s1 = null;
        Student s2 = new Student("Zhangsan" , 23);
        //可以用不为空的调用
        System.out.println(s2.equals(s1));

        //有对象为空的时候，就不能用Object里的equals方法了，s1.equals(s2)
        //就要用Objects
        System.out.println(Objects.equals(s1, s2));
        //细节：
        //1、判断s1是否为null，如果为null直接返回false
        //2、如果不为null，那利用s1再次调用equals方法
        //3、此时s1是Student类型，那么调用的是重写了的equals方法
        // 如果没有重写，就是调用Object里面的方法，比较地址值

        //判断null
        Student s3 = new Student();
        Student s4 = null;
        System.out.println(Objects.isNull(s3));
        System.out.println(Objects.isNull(s4));

    }
}
