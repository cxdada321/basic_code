package polymorphismdemo1;

public class Test {
    public static void main(String[] args) {
        //创建两个对象，调用register方法
        Student s = new Student("张三", 23);
        Teacher t = new Teacher("李四", 24);
        register(s);
        register(t);
    }
    //定义一个方法，既能接收学生对象，又能接收老师对象
    //只能把这个参数写成三个类型的父类
    public static void register(Person p) {
        p.show();
    }
}
