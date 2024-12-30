package polymorphismdemo1;

public class Teacher extends Person{
    @Override
    public void show() {
        System.out.println("老师信息为：姓名：" + getName() + "，年龄：" + getAge());
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher() {
    }
}
