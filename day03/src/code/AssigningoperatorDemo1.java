package code;

public class AssigningoperatorDemo1 {
    public static void main(String[] args) {
        //+=
        //变量+=表达式，等价于变量=（变量+表达式）
        int a = 10;
        int b = 20;
        a += b;
        System.out.println(a);
        System.out.println(b);

        //细节
        //+=,-=,%=,/=,*=扩展赋值运算符，隐含了强制类型转换
        short s = 10;
        s += 20;
        //s = s + 20; //编译报错，需要强转
        System.out.println(s);
    }
}
