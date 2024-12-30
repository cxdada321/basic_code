package oopextendsdemo5;

public class Student extends Person {
    //子类构造方法中有个Super()，表示调用父类的无参构造方法
    public Student() {
        //写在第一行
        super();
        System.out.println("子类的无参构造");
    }
    public Student(String name, int age) {
        super(name, age);
    }
}
