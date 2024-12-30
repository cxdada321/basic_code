package test;

public class test2 {
    public static void main(String[] args) {
        //需求：定义一个方法求长方形周长，将结果在方法中打印
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("请输入长方形的长：");
        int length = sc.nextInt();
        System.out.println("请输入长方形的宽：");
        int width = sc.nextInt();
        perimeter(length, width);
    }
    public static void perimeter(int number1, int number2){
        int sum = (number1 + number2) * 2;
        System.out.println("长方形的周长是：" + sum);
    }
}
