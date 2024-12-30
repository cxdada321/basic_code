package test;

import java.util.Random;

public class Test8 {
    public static void main(String[] args) {
        /*抢红包
        * 现金红包一共有{2，588，888，1000，10000}五个奖金
        * 用代码模拟抽奖，打印出每个奖项，奖项的出现顺序要随机且不重复*/
        int[] arr = {2, 588, 888, 1000, 10000};
        java.util.Random r = new java.util.Random();
        while (true) {
            int num = r.nextInt(5);
            if (arr[num] != 0){
                System.out.println("恭喜你抽中了" + arr[num] + "元");
                arr[num] = 0;
            }else if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0 && arr[3] == 0 && arr[4] == 0){
                System.out.println("红包已抢完！");
                break;
            }
        }

    }
}
