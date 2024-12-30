package eu.hust.objectdemo.bigdecimaldemo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo2 {
    public static void main(String[] args) {
        //除法
        BigDecimal bd1 = new BigDecimal("2.9");
        BigDecimal bd2 = new BigDecimal("3.0");
        //数值，保留几位，舍入规则
        System.out.println(bd2.divide(bd1, 2, RoundingMode.HALF_UP));
    }
}
