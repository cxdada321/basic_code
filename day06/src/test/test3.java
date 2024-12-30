package test;

public class test3 {
    public static void main(String[] args) {
        /*需求：定义一个方法，求一家商场每个季度的营业额
        * 根据方法结果再计算全年总额*/
        int jidu1 = getSum(10, 20, 30);
        int jidu2 = getSum(20, 30, 40);
        int jidu3 = getSum(30, 40, 50);
        int jidu4 = getSum(40, 50, 60);
        System.out.println("全年总额：" + (jidu1 + jidu2 + jidu3 + jidu4));
    }
    public static int getSum(int a, int b, int c){
        return a + b + c;
    }
}
