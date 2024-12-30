package eu.hust.objectdemo.bigintegerdemo;


import java.math.BigInteger;
import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Random;

public class BigIntegerDemo1 {
    public static void main(String[] args) {
        //获取随机大整数，2*（num-1）
        BigInteger bigInteger = new BigInteger(3, new Random());
        System.out.println(bigInteger);

        //获取一个指定的大整数
        //字符串中必须是整数，不然会报错
        BigInteger bigInteger1 = new BigInteger("1234567890");
        System.out.println(bigInteger1);

        //获取一个指定进制的大整数
        BigInteger bigInteger2 = new BigInteger("11", 2);
        System.out.println(bigInteger2);

        //静态方法获取BigInteger对象
        //细节：
        //1、能表示的范围比较小，在long的范围内
        //2、在内部对于-16 ~ 16，会进行缓存，不会重复创建对象
        /*BigInteger bigInteger3 = BigInteger.valueOf(11);
        BigInteger bigInteger4 = BigInteger.valueOf(11);
        BigInteger bigInteger5 = BigInteger.valueOf(17);
        BigInteger bigInteger6 = BigInteger.valueOf(17);
        System.out.println(bigInteger5 == bigInteger6);
        System.out.println(bigInteger3 == bigInteger4);*/

        //对象一旦创建，内部数据不变
        BigInteger bigInteger7 = BigInteger.valueOf(1);
        BigInteger bigInteger8 = BigInteger.valueOf(2);
        System.out.println(bigInteger7.add(bigInteger8));
        //此时不会修改参与计算的BigInteger对象，只会创建一个新的对象记录


    }
}
