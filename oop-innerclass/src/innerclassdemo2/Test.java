package innerclassdemo2;

public class Test {
    public static void main(String[] args) {
        /*编写成员内部类注意点：
        * 1、成员内部类可以被一些修饰符所修饰，如：private，默认等等
        * 2、成员内部类中，JDK之前不能定义静态变量，之后才可以
        *
        * 获取成员内部类的方式：
        * 1、外部类编写方法，对外提供内部类
        * 2、直接创建
        * 外部类名.内部类名 对象 = new 外部类对象.内部类对象 因为内部类也相当于一个成员变量
        * Outer.Inner o = new Outer().new Inner();
        * */

        //创建内部类对象
        //这种在private下会报错，因为Inner是private的，所以不能直接访问
        /*Outer.Inner oi = new Outer().new Inner();
        oi.show();*/

        //返回值用Objct这个大的父类接收，这样就可以访问到Inner类的方法
        /*Outer.Inner oi = new Outer().new Inner();
        Outer o = new Outer();
        o.show();
        oi.show();
        System.out.println(oi.name);*/
        System.out.println(new Outer().getInner());
        Outer o = new Outer();
        o.show();
        System.out.println(o.getInner());
        new Outer().getInner();
    }
}
