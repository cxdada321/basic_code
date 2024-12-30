package test;

import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
        /*需求：自动生成一个1-100之间的随机数
        使用程序实现猜数字的小游戏
         */
        java.util.Random r = new Random();
        //范围一定是从0开始的，到这个数结束，不包括这个数，包头不包尾，包左不包右
        //秘诀
        //用来生成任意数到任意数之间的随机数 7~15
        //头尾都减去一个值使其从0开始  -7  0~8
        //尾巴加一 8 + 1 = 9
        //最终结果再加上第一步减去的值
        int number = r.nextInt(100) + 1;
        System.out.println(number);
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int count = 1;

        while (true){

            System.out.println("请输入一个1-100之间的数字：");
            int guessNumber = sc.nextInt();
            if(count == 3){
                System.out.println("已猜中");
                break;
            }
            if (guessNumber > number){
                System.out.println("你猜的数字" + guessNumber + "大了");
                count++;
            }else if (guessNumber < number){
                System.out.println("你猜的数字" + guessNumber + "小了");
                count++;
            }else{
                System.out.println("恭喜你，猜中了");
                break;
            }
        }
    }
}
