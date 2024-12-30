package eu.hust.objectdemo.bigdecimaldemo;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigDecimalDemo1 {
    public static void main(String[] args) {
        //传递double小数创建对象
        //有可能不太精确，不建议使用
        BigDecimal bigDecimal = new BigDecimal(0.111);
        System.out.println(bigDecimal);

        //传递字符串创建对象
        BigDecimal bigDecimal2 = new BigDecimal("0.111");
        System.out.println(bigDecimal2);

        System.out.println(bigDecimal2.add(bigDecimal));

        //静态方法获取对象
        //valueof也是new一个字符串
        BigDecimal bigDecimal3 = BigDecimal.valueOf(1.0);//传递的是double就会new一个新对象，除非是0~10的整数
        BigDecimal bigDecimal4 = BigDecimal.valueOf(1);
        System.out.println(bigDecimal3);
        System.out.println(bigDecimal3 == bigDecimal4);

        //如果表示数字不大，没有超过doouble的范围，可以使用double
        //如果表示数字很大，超过double的范围，建议使用构造方法
        //如果我们创建的是0 ~ 10的整数，那么方法会返回一个已经创建好的对象，不会重复创建
    }
}
