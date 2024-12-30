package test;

import java.util.Random;

public class Test9 {
    public static void main(String[] args) {
        /*抢红包
        * 现金红包一共有{2，588，888，1000，10000}五个奖金
        * 用代码模拟抽奖，打印出每个奖项，奖项的出现顺序要随机且不重复*/
        int[] arr = {2, 588, 888, 1000, 10000};
        Random r = new Random();
        //优化，打乱数组索引的方式减少循环次数
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int num = r.nextInt(5);
            arr[i] = arr[num];
            arr[num] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("恭喜你抽中了" + arr[i] + "元");
        }

    }
}
