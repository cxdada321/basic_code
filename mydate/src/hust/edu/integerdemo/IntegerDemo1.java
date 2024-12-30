package hust.edu.integerdemo;

public class IntegerDemo1 {
    public static void main(String[] args) {
        //整数转为二进制
        String str = Integer.toBinaryString(100);
        System.out.println(str);

        //八进制
        String str1 = Integer.toOctalString(100);
        System.out.println(str1);

        //十六进制
        String str2 = Integer.toHexString(100);
        System.out.println(str2);

        //字符串转为int类型的整数
        int i = Integer.parseInt("123");
        System.out.println(i + 123);
        //8种包装类中除了Character都有对应parseXXX方法
        String str3 = "true";
        boolean b = Boolean.parseBoolean(str3);
        System.out.println(b);
    }
}
