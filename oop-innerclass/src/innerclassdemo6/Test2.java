package innerclassdemo6;

public class Test2 {
    public static void main(String[] args) {
        /*匿名内部类的格式
        *
        *
        *       new 类/接口（） {
        *           重写的方法；
        *       }*/
        //整体可以理解为Swim接口的实现类对象
        Swim s = new Swim() {
            @Override
            public void swimming() {
                System.out.println("匿名内部类重写了swimming方法");
            }
        };
        s.swimming();
    }
}
