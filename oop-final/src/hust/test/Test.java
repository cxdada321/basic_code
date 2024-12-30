package hust.test;

public class Test {
    public static void main(String[] args) {
        /*final修饰方法：
        * 表明该方法为最终方法，不能被重写
        * final修饰类：
        * 表明该类是最终类，不能被继承
        * final修饰变量：
        * 叫做常量，只能赋值一次*/
    }
}

class Fu {
    public final void show() {
        System.out.println("fu show");
    }
}

class Zi extends Fu {
    // @Override
    // public void show() {
    //     System.out.println("zi show");
    // }
}