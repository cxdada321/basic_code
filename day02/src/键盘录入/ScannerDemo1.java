package 键盘录入;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        //创建对象，表示使用Scanner这个类
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");

        //变量i记录了键盘录入的数据
        int i = sc.nextInt();

        //输出
        System.out.println(i);
    }
}
