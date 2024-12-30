package polymorphismdemo2;

public class Test {
    public static void main(String[] args) {
        //创建对象（多态）
        //Fu f = new Zi();
        Animal a = new Dog();
        //调用成员变量，编译看左边，运行看左边，
        //编译看左边：javac编译代码时，会看父类中有没有这个变量，没有则编译失败
        //运行看左边：java运行代码时，实际获取的就是父类中的变量
        System.out.println(a.name);
        System.out.println("------------");
        //调用成员方法，编译看左边，运行看右边
        //编译看左边：javac编译代码时，会看父类中有没有这个方法，没有则编译失败
        //运行看右边：java运行代码时，实际调用的是子类中的方法
        a.show();
    }
}

class Animal {
    String name = "动物";
    public void show() {
        System.out.println("动物的show方法");
    }
}

class Dog extends Animal {
    String name = "狗";
    @Override
    public void show() {
        System.out.println("狗的show方法");
    }
}

class Cat extends Animal {
    String name = "猫";
    @Override
    public void show() {
        System.out.println("猫的show方法");
    }
}
