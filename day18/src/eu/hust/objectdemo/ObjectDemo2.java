package eu.hust.objectdemo;

public class ObjectDemo2 {
    public static void main(String[] args) {
        //equals() 比较两个对象是否相同
        Student s1 = new Student("张三", 23);
        Student s2 = new Student("张三", 23);
        System.out.println(s1.equals(s2));//false,比较的是两个对象的内存地址,要重写Student类的equals()方法

    }
}
