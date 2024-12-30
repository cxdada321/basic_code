package sigletest;

public class ScanString {
    public static void main(String[] args) {
        /*遍历字符串
        * 键盘录入一个字符串，使用程序实现在控制台遍历该字符串*/
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str1 = sc.next();
        for (int i = 0; i < str1.length(); i++) {
            System.out.printf("%c ", str1.charAt(i));
        }
    }
}
