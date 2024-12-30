package sigletest;

public class CountString {
    public static void main(String[] args) {
        /*统计字符次数
        * 录入一个字符串，统计该字符中大写字母字符，小写字母和数字字符出现的次数*/
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();
        System.out.printf("大写字母字符个数%d", getCount(str, 'A', 'Z'));
        System.out.println();
        System.out.printf("小写字母字符个数%d", getCount(str, 'a', 'z'));
        System.out.println();
        System.out.printf("数字字符个数%d", getCount(str, '0', '9'));
        System.out.println();

        System.out.printf("字符: %c, ASCII码: %d\n", 'c', (int)'c');


    }
    public static int getCount(String str ,char a ,char b){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= a && str.charAt(i) <= b){
                count++;
            }
        }
        return count;
    }

}
