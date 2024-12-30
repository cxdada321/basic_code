package sigletest;

public class TurnWord {
    public static void main(String[] args) {
        /*句子反转
        * 定义一个方法
        * 键盘录入一个句子*/
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.nextLine();

        System.out.println(reverse(str));
    }
    public static String reverse(String str){
        char[] arr = new char[str.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = str.charAt(i);
        }
        String str1 = new String();
        int index = arr.length;
        for (int i = arr.length - 1; i  >= 0; i --) {
            if (arr[i] == ' ') {
                for (int i1 = i + 1; i1 < index; i1++) {
                    str1 += arr[i1];
                }
                str1 += ' ';
                index = i;
            } else if (i == 0) {
                for (int i1 = i; i1 < index; i1++) {
                    str1 += arr[i1];
                }
            }
        }
        return str1;
    }

}
