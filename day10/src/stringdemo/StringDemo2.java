package stringdemo;

public class StringDemo2 {
    public static void main(String[] args) {
        //创建两个字符串对象
        String str1 = new String("hello");
        String str2 = new String("HEllo");
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        boolean b = str1.equalsIgnoreCase(str2);

    }
}
