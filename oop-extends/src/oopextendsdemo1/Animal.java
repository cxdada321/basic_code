package oopextendsdemo1;

public class Animal {

    //注意事项，子类只能访问父类中非私有的成员
    public static void eat() {
        System.out.println("Animal is eating");
    }
    public static void drink() {
        System.out.println("Animal is drinking");
    }
}
