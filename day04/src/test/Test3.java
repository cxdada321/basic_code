package test;

import java.util.Scanner;

public class Test3 {

    /*电影院选座
    假设电影院有100张票，票序号为1~100
    其中奇数坐左侧，偶数坐右侧
    键盘录入一个整数表示票号
    根据不同情况给出提示：
    如果输入的票号是奇数，输出“你坐在左侧”
    如果输入的票号是偶数，输出“你坐在右侧”
     */
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int ticket = sc.nextInt();
        //只有0~100的票号才有效
        if(ticket < 0 || ticket > 100){
            System.out.println("输入的票号无效");
            return;//结束程序
        }
        if (ticket % 2 == 0) {
            System.out.println("你坐在右侧");
        } else {
            System.out.println("你坐在左侧");
        }
    }

}

