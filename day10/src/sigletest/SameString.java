package sigletest;

public class SameString {
    public static void main(String[] args) {
        /*对称字符串
        * 键盘接受一个字符串，程序判断是对称还是不对称*/

        //使用StringBuilder的场景
        //1.字符串拼接
        //2.字符串反转
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("请输入一个字符串：");
        StringBuilder sb = new StringBuilder(sc.next());
        if (sb.toString().equals(sb.reverse().toString())) {
            System.out.println("对称");
        } else {
            System.out.println("不对称");
        }
    }
}
