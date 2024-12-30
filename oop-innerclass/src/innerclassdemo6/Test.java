package innerclassdemo6;

public class Test {
    public static void main(String[] args) {
        /*匿名内部类
        * new 类名或者接口名（） {
        *   重写方法；
        * };*/

        //编写匿名内部类
        //接口实现
        new Swim() {
            @Override
            public void swimming() {
                System.out.println("匿名内部类重写了swimming方法");
            }
        };

        //类继承
        new Animal() {

            @Override
            public void eat() {
                System.out.println("匿名内部类重写了eat方法");
            }
        };

        //匿名内部类可以用来在方法中创建一个临时的类
        //这样用多态的时候不需要重新写一个类去继承父类再创建对象调用方法
        //直接在方法中创建一个匿名内部类对象调用方法即可
        method(
                new Animal() {
                    @Override
                    public void eat() {
                        System.out.println("狗吃骨头");
                    }
                }
        );
    }
    public static void method(Animal a) { //Animal a = 子类对象 多态
        a.eat();
    }
}
