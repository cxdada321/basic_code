package test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
       /*
       两只老虎体重由键盘录入
       判断两只老虎体重是否相同
       */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一只老虎的体重：");
        int tiger1 = sc.nextInt();
        System.out.println("请输入第二只老虎的体重：");
        int tiger2 = sc.nextInt();
        String result = tiger1 == tiger2 ? "两只老虎体重相同" : "两只老虎体重不同";
        System.out.println(result);
    }
}
