package hust.edu.integerdemo;

import java.util.Scanner;

public class IntegerDemo2 {
    public static void main(String[] args) {
        //键盘录入，就可以结合类型转换，用nextLine()方法接收，然后转换成需要用的类型
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double number = Double.parseDouble(input);
        System.out.println("Converted number: " + (number + 1));
    }
}
