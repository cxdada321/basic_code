package code;

public class ArithmeticoperatorDemo3 {
    public static void main(String[] args) {
        //++ -- 自增自减

        //变量++ -- 在后，先参与运算，再自增自减，先用后加减
        int a = 10;
        a++;
        System.out.println(a);
        //变量++ -- 在前，先自增自减，再参与运算，先加减后用
        ++a;
        System.out.println(a);
        a--;
        System.out.println(a);
        --a;
        System.out.println(a);
    }
}
