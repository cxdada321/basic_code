package test;

import java.util.Scanner;

public class Test4 {
    /*键盘录入会员级别，算出实际支付的钱
    总价为1000
    会员一级：打9折
    会员二级：打8折
    会员三级：打7折
    非会员：不打折
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入会员级别：");
        String level = sc.next();
        double price = 1000;
        if ("一级".equals(level)) {
            price *= 0.9;
        } else if ("二级".equals(level)) {
            price *= 0.8;
        } else if ("三级".equals(level)) {
            price *= 0.7;
        }
        System.out.println("实际支付：" + price);
    }
}

