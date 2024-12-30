package hust.edu.lambdademo;

public class LambdaDemo {
    public static void main(String[] args) {
        /*1、lambda可以用来简化匿名内部类
        * 2、lambda只能用来简化函数式接口的匿名内部类方法
        * 3、函数式接口:
        *   有且仅有一个抽象方法，接口上方可以用@FuncitonalInterface注解*/

        //1、利用匿名内部类的形式去调用下面的方法
        //调用一个方法的时候，如果方法的形参是一个接口，那么我们可以传递这个接口的实现类对象
        //如果这个对象只用一次，就可以用匿名内部类的形式



        /*method(new Swim() {
            @Override
            public void swimming() {
                System.out.println("匿名内部类实现游泳");
            }
        });*/
        method(
                () -> {
                System.out.println("lambda实现游泳");
        });
    }

    public static void method(Swim s) {
        s.swimming();
    }


}
@FunctionalInterface
interface Swim {

    public abstract void swimming();
    //public abstract void eat();

}