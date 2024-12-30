package test;

public class test1 {
    public static void main(String[] args) {
        /*需求：定义一个方法，在方法内部定义两个变量
        * 求出他们的和并打印*/
        calculate();
    }
    public static void calculate(){
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("sum = " + sum);
    }
}
