package innerclassdemo5;

public class Test {
    public static void main(String[] args) {
        /*局部内部类
        * 1、将内部类定义在方法里
        * 2、外界无法直接使用局部内部类，需要在方法中创建对象并使用
        * 3、该类可以直接访问外部类的成员，也可以访问方法中的局部变量*/
        Outer o = new Outer();
        o.show();

    }
}
