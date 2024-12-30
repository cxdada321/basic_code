package eu.hust.regexdemo;

import java.util.Scanner;

public class RegexDemo1 {
    public static void main(String[] args) {
        /*正则表达式
        * 验证qq是否正确
        * 6到20位以内，0不能开头，都是数字*/

        //以前的方法
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入qq号：");
        String qq = sc.nextLine();

        //正则表达式，括号里写正则表达式
        //一个方括号代表一个字符，[1-9]代表1到9中的任意一个数字，大括号代表重复次数，{5,19}代表19次，第一个方括号就表示第一个数字不能是0
        System.out.println(qq.matches("[1-9][0-9]{5,19}"));
        checkQQnum(qq);
    }

    private static void checkQQnum(String qq) {
        //为了便于阅读
        //写代码的核心思想是：
        //1.先判断不合法的情况
        //2.再判断合法的情况
        //就可以避免下面这种写很多if嵌套的情况

        if (qq.charAt(0) != '0') {
            if (qq.length() >= 6 && qq.length() <= 20) {
                for (int i = 1; i < qq.length(); i++) {
                    if (qq.charAt(i) < '0' || qq.charAt(i) > '9') {
                        System.out.println("qq号不合法");
                        break;
                    }
                    if (i == qq.length() - 1) {
                        System.out.println("qq号合法");
                    }
                }
            } else {
                System.out.println("qq号长度不对");
            }
        } else {
            System.out.println("qq号不能以0开头");
        }
    }
}
