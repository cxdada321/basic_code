package eu.hust.test;
import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        //验证码
        //给定一个字符串，随机生成一个验证码
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < 26; i++) {
                sb.append((char)((65 + j * 32) + i ));
            }
        }
        System.out.println(sb);
        //随机选一个位置为数字，其余为字母
        int index = new Random().nextInt(5);
        for (int i = 0; i < 5; i++) {
            if (index == i) {
                sb1.append(arr[new Random().nextInt(10)]);
            } else {
                sb1.append(sb.charAt(new Random().nextInt(52)));
            }

        }
        System.out.println(sb1);
    }
}
