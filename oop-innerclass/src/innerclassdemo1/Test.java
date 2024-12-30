package innerclassdemo1;

public class Test {
    public static void main(String[] args) {
        /*写一个类描述骑车
        * 属性：汽车品牌、车龄、颜色，发动机的品牌、使用年限
        *
        * 内部类的访问特点：
        * 内部类可以直接访问外部类的成员，包括私有
        * 外部类要访问内部类必须创建对象*/
        Car c = new Car("奔驰", 3, "黑色");
        c.show("奔驰发动机", 2);
    }
}
