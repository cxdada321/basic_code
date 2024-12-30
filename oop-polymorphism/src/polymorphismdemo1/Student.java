package polymorphismdemo1;

public class Student extends Person{
    @Override
    public void show() {
        System.out.println("学生信息为：姓名：" + getName() + "，年龄：" + getAge());
    }

    public Student(String name, int age) {
        super(name, age);
    }

    public Student() {
    }
}
