package sigletest;

public class TurnString {
    public static void main(String[] args) {
        /*字符串反转
        * 定义一个方法
        * 键盘录入一个字符串*/
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();
        System.out.println(reverse(str));
    }
    public static String reverse(String str){
        char[] arr = new char[str.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = str.charAt(i);
        }
        for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        String str1 = new String(arr);
        return str1;
    }

}
