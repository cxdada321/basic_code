package orderdemo;
import java.util.Scanner;

public class OrderDemo {
    public static void main(String[] args) {
        //需求：键盘录入女婿酒量，大于两斤，老丈人给出回应，否则不回应

        System.out.println("请输入女婿的酒量：");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        if(a > 2)
            System.out.println("小伙子不错！");
    }
}
