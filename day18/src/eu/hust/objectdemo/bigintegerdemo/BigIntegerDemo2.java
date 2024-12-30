package eu.hust.objectdemo.bigintegerdemo;


import java.math.BigInteger;
import java.util.Random;

public class BigIntegerDemo2 {
    public static void main(String[] args) {
        BigInteger bigInteger = BigInteger.valueOf(10);
        BigInteger bigInteger1 = BigInteger.valueOf(12);
        //加法
        System.out.println(bigInteger1.add(bigInteger));

        //除法获取商和余数
        BigInteger[] bigIntegers = bigInteger1.divideAndRemainder(bigInteger);
        for (int i = 0; i < bigIntegers.length; i++) {
            System.out.println(bigIntegers[i]);
        }

        //比较大小，重写过了，比的是属性值不是地址
        System.out.println(bigInteger1.equals(bigInteger));

        //次幂
        System.out.println(bigInteger.pow(2));

        //获取最大值
        System.out.println(bigInteger.max(bigInteger1));

        //转换为int类型，超出范围就会报错
        int i = bigInteger.intValue();
    }
}
