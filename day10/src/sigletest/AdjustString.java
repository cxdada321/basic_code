package sigletest;

public class AdjustString {
    public static void main(String[] args) {
        /*调整字符串
        * A的旋转操作就是把A最左边的字符移到最右边
        * 如果若干次调整操作，A能变成B，那么返回True
        * 如果不能匹配成功，则返回false*/
        String A = "abcdef";
        String B = "defabcd";
        for (int i = 0; i < A.length() - 1; i++) {
            if (B.equals(rotateString(A))) {
                System.out.println("True");
                return;
            } else {
                A = rotateString(A);
            }
        }
        System.out.println("False");
    }
    /*public static String rotateString(String A){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < A.length(); i++) {
            if ( i != 0) {
                sb.append(A.charAt(i));
            }
        }
        sb.append(A.charAt(0));
        return sb.toString();
    }*/

    //用字符数组toCharArray()方法
    public static String rotateString(String A){
        char[] chs = A.toCharArray();
        for (int i = 0; i < chs.length - 1; i++) {
            char temp = chs[i];
            chs[i] = chs[i + 1];
            chs[i + 1] = temp;
        }
        String str = new String(chs);
        return str.toString();

    }
}