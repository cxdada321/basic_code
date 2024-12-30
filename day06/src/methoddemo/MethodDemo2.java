package methoddemo;

public class MethodDemo2 {
    public static void main(String[] args) {
        method(10, 20);
    }
    public static void method(int number1, int number2){
        int sum = number1 + number2;
        System.out.println("sum = " + sum);
    }
}
