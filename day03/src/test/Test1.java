package test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //键盘录入三位数，拆分为个、十、百，打印在控制台
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int i = sc.nextInt();
        int ge = i % 10;
        int shi = i / 10 % 10;
        int bai = i / 100;
        System.out.println("个位是：" + ge + "十位是：" + shi + "百位是：" + bai);
        //键盘录入两个整数，比较大小
        System.out.println("请输入两个整数");
    }
}
