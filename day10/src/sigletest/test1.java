package sigletest;

public class test1 {
    public static void main(String[] args) {
        /*内容：可以是小写字母，大写字母，也可以是数字
        * 规则：长度为5
        * 其中四位是字母，一位数字
        * 其中数字只有1位，但是可以出现在任意位置*/
        java.util.Random r = new java.util.Random();
        char[] chs = new char[5];
        int num = r.nextInt(5);
        for (int i = 0; i < 5; i++) {
            if (i == num) {
                chs[i] = (char) (r.nextInt(10) + '0');
            } else {
                int num1 = r.nextInt(2);
                if (num1 == 0) {
                    chs[i] = (char)(r.nextInt(26) + 'a');
                } else {
                    chs[i] = (char)(r.nextInt(26) + 'A');
                }
            }
        }

        System.out.println(new String(chs));
    }
}
