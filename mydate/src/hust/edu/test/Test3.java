package hust.edu.test;

public class Test3 {
    public static void main(String[] args) {
        /*实现toBinaryString方法，把一个十进制整数转成字符串表示的二进制*/
        int i = 50;
        System.out.println(toBinary(i));
        System.out.println(Integer.toBinaryString(i));
    }

    private static String toBinary(int i) {
        StringBuilder sb = new StringBuilder();
        while (i / 2 != 0){
            //或者用insert每次都插入到第一个位置，就不用再reverse了
            sb.append(i % 2);
            i /= 2;
        }
        sb.append(i % 2);
        return sb.reverse().toString();
    }
}
