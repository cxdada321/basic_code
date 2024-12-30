package test;

/**
 * @author chenxin
 */
public class PhoneTest {
    public static void main(String[] args) {
        //创建手机的对象
        //类名 对象名 = new 类名();
        Phone p = new Phone();

        //给手机赋值
        p.brand = "小米";
        p.price = 2999;
        System.out.println(p.brand);
        System.out.println(p.price);

        //调用方法
        p.call("张三");
        p.playGame();
    }
}
