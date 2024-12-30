package stringdemo;

public class StringDemo1 {
    public static void main(String[] args) {
        //直接赋值获取一个字符串对象
        String str1 = "hello";
        System.out.println(str1);

        //使用new的方式获取字符串对象
        //空参构造：创建一个空字符串对象
        String str2 = new String();
        System.out.println("@" + str2 + "!");

        //传递字符串，再创建一个字符串对象，脱裤子放屁
        String str3 = new String("world");
        System.out.println(str3);

        //传递字符数组，创建一个字符串对象
        //需求：通过字符数组创建字符串对象可以修改字符串对象的内容
        char[] chs = {'a', 'b', 'c'};
        String str4 = new String(chs);
        System.out.println(str4);

        //传递字节数组，创建一个字符串对象
        //应用场景：以后在网络当中传递的数据其实都是字节数组
        //我们一般要把字节信息转换成字符串，就用到这个构造
        byte[] bys = {97, 98, 99};
        String str5 = new String(bys);
        System.out.println(str5);
    }
}
