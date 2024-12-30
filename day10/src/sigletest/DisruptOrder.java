package sigletest;

public class DisruptOrder {
    public static void main(String[] args) {
        //键盘输入任意字符串，打乱里面的内容
        java.util.Scanner sc = new java.util.Scanner(System.in);
        java.util.Random r = new java.util.Random();
        System.out.println("请输入一个字符串：");
        String str = sc.next();
        char[] chs = str.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            char temp = chs[i];
            int num = r.nextInt(chs.length);
            chs[i] = chs[num];
            chs[num] = temp;
        }
        System.out.println(new String(chs));
    }
}
