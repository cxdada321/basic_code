package test;

import java.util.Random;

public class Test3 {
    /*需求：定义方法实现随机产生一个五位的验证码
    * 格式：长度5，前四位是大写或者小写字母，最后位是数字
    * */
    public static void main(String[] args) {
        char []bigfArr = new char[26];
        char []smallArr = new char[26];
        bigfArr = putIn(65,90);
        smallArr = putIn(97, 122);
        for (int i = 0; i < 5; i++) {
            int num = randomNum(2);
            if (i == 4) {
                System.out.print(randomNum(9));
            } else if (num == 1) {
                System.out.print(bigfArr[randomNum(26)]);
            } else if (num == 2) {
                System.out.print(smallArr[randomNum(26)]);
            }
        }
    }
    public static int randomNum(int num){
        java.util.Random r = new Random();
        return r.nextInt(num) + 1;
    }
    public static char[] putIn(int from, int to){
        char []arr = new char[to - from + 1];
        for (int i = 0, j = from; i < arr.length; i++, j++){
            arr[i] = (char)j;
        }
        return arr;
    }

}
