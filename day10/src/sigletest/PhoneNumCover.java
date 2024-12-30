package sigletest;

public class PhoneNumCover {
    public static void main(String[] args) {
        /*手机号屏蔽*/
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("请输入一个手机号：");
        String num = sc.next();

        //截取法
        //截取前面三位和后面四位
        String str1 = num.substring(0, 3);
        String str2 = num.substring(7);
        System.out.println(str1 + "****" + str2);

        /*
        char[] arr = new char[num.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = num.charAt(i);
        }
        for (int i = 3; i < 7; i++) {
            arr[i] = '*';
        }
        String str = new String(arr);
        System.out.println(str);

         */
    }
}
