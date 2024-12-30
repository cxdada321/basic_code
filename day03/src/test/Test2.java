package test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
       /*
       键盘录入两个整数（手动输入0~10之间的整数）
       比较两个整数大小
       */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int you = sc.nextInt();
        System.out.println("请输入另一个整数：");
        int she = sc.nextInt();
        System.out.println("你输入的是：" + you);
        System.out.println("她输入的是：" + she);
        if (you > she) {
            System.out.println("你比她大");
        } else if (you < she) {
            System.out.println("你比她小");
        } else {
            System.out.println("你和她一样大");
        }
    }
}
