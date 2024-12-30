package test;

import java.util.Objects;

public class Test1 {
    public static void main(String[] args) {
        /*机票价格按着淡季旺季、头等舱和经济舱收费，输入机票原价，月份和头等舱或者经济舱
         * 按照如下规则计算机票价格：旺季（5-10月）头等舱9折，经济舱8.5折，淡季（11月到来年4月）头等舱7折，经济舱6.5折*/
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("请输入机票原价：");
        double price = sc.nextDouble();
        System.out.println("请输入月份：");
        int month = sc.nextInt();
        System.out.println("请输入舱位：");
        String type = sc.next();
        /*
        switch (type) {
            case "头等舱"-> System.out.println("机票价格为：" + getPrice(month, type, price));

            case "经济舱"-> System.out.println("机票价格为：" + getPrice(month, type, price));

            default->System.out.println("输入错误");
        }

         */

        //选中代码 ctrl alt M 自动提取方法

        if (Objects.equals(type, "头等舱")) {
            getPrice(month, price, 0.9, 0.7);
        }else{
            getPrice(month, price, 0.85, 0.65);
        }


    }

    public static void getPrice(int month, double price, double x, double x1) {
        if (month >= 5 && month <= 10) {
            System.out.println("机票价格为：" + price * x);
        } else {
            System.out.println("机票价格为：" + price * x1);
        }
    }
    /*
    public static double getPrice(int month, String type, double price){
        String type1 = "头等舱";
        if (Objects.equals(type, type1)) {
            if (month >= 5 && month <= 10) {
                return price * 0.9;
            } else {
                return price * 0.7;
            }
        }else{
            if (month >= 5 && month <= 10) {
                return price * 0.85;
            } else {
                return price * 0.65;
            }
        }
    }

     */
}
