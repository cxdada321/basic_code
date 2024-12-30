package test;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        /*键盘录入星期数，显示今天的减肥活动
        周一：跑步
        周二：游泳
        周三：慢走
        周四：动感单车
        周五：拳击
        周六：爬山
        周日：好好吃一顿
         */
        java.util.Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int week = sc.nextInt();
        /*switch(week){
            case 1:
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("游泳");
                break;
            case 3:
                System.out.println("慢走");
                break;
            case 4:
                System.out.println("动感单车");
                break;
            case 5:
                System.out.println("拳击");
                break;
            case 6:
                System.out.println("爬山");
                break;
            case 7:
                System.out.println("好好吃一顿");
                break;
            default:
                System.out.println("输入的星期数无效");
         */

        switch(week){
            //单行可以省略大括号
            case 1 -> System.out.println("跑步");
            case 2 -> System.out.println("游泳");
            case 3 -> System.out.println("慢走");
            case 4 -> System.out.println("动感单车");
            case 5 -> System.out.println("拳击");
            case 6 -> System.out.println("爬山");
            case 7 -> System.out.println("好好吃一顿");
            default -> System.out.println("输入的星期数无效");
        }
    }
}
