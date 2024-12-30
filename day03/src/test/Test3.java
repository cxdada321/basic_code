package test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
       /*
       键盘录入两个整数
       如果其中一个为6，结果输出true
       如果和为6的倍数，结果输出true
       其他情况都为false
       */
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int a =sc.nextInt();
        System.out.println("请输入另一个整数：");
        int b =sc.nextInt();
        boolean result = (6 == a || b ==6) || (a + b) % 6 == 0;
        System.out.println(result);
    }
}
