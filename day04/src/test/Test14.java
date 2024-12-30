package test;

public class Test14 {
    public static void main(String[] args) {
        /*需求：给定两个正整数
        将两数相除，要求不使用乘法，除法和取模运算符
        得到商和余数
         */
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("请输入第一个正整数：");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个正整数：");
        int number2 = sc.nextInt();
        int count = 0;
        while(number1 - number2 >= 0){
            number1 -= number2;
            count++;
        }
        System.out.println("商：" + count);
        System.out.println("余数：" + number1);
    }
}
