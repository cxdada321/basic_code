package test;

public class Test2 {
    public static void main(String[] args) {
        /*求平方根
        需求：键盘录入一个大于等于2的整数x，计算并返回x的平方根
        结果只保留整数部分，舍去小数部分
         */
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("请输入一个大于等于2的整数：");
        int number = sc.nextInt();
        for(int i = 1;i <= number; i++){
            if(i * i < number && (i + 1) * (i + 1) > number){
                System.out.println(i + "就是" + number + "的平方根的整数部分");
                break;
            }else
            if(i * i == number){
                System.out.println(i + "就是" + number + "的平方根");
                break;
            }
        }
    }
}
