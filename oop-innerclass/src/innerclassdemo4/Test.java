package innerclassdemo4;

public class Test {
    public static void main(String[] args) {
        /*注意事项：
        * 1、静态内部类也是成员内部类的一种
        * 2、静态内部类只能访问外部类中的静态变量和静态方法
        * 如果要访问非静态的需要创建对象
        *
        * 创建静态内部类的格式:
        *       外部类名.内部类名 对象名 = new 外部类名.内部类名（）；
        * 调用静态方法的格式
        *       外部类名.内部类名.方法名（）；*/
        Outer o = new Outer();
        o.show1();
        Outer.Inner oi = new Outer.Inner();
        oi.show2();
        Outer.Inner.show2();
    }
}
