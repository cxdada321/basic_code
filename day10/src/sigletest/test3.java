package sigletest;

public class test3 {
    public static void main(String[] args) {
        /*给你一个字符串s，由若干单词组成，单词前后用一些空格字符隔开
        * 返回字符串中最后一个单词的长度*/
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("请输入一个字符串：");
        StringBuilder str = new StringBuilder(sc.nextLine());
        int index = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == ' ') {
                index = i;
                break;
            }
        }
        System.out.println("最后一个单词为：");
        System.out.println(str.substring(index + 1));
        System.out.println("最后一个单词的长度为：");
        System.out.println(str.substring(index + 1).length());
    }
}
