package eu.hust.mathdemo1;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        //判断一个数是否为质数
        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int num = s.nextInt();
        if (num == 1) {
            System.out.println("不是质数");
            return;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println("不是质数");
                return;
            }
        }
        System.out.println("是质数");
        }
    }
