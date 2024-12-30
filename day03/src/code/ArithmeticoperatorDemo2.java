package code;

public class ArithmeticoperatorDemo2 {
    public static void main(String[] args) {
        byte a1 = 100;
        byte b1 = 100;

        //(byte)b1+b2强转的是b1，并不是最终结果
        byte a = (byte) (a1 + b1);
        System.out.println(a);
    }
}
