package eu.hust.mathdemo1;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringJoiner;

public class DaffodilNumber {
    public static void main(String[] args) {
       /* //判断一个数是否为水仙花数，即一个n位自然数自身各个位数上数字的n次幂之和
        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int num = s.nextInt();*/

        //获取一个范围内的所有水仙花数
        Scanner s = new Scanner(System.in);
        System.out.println("请输入下限：");
        int floor = s.nextInt();
        System.out.println("请输入上限：");
        int ceil = s.nextInt();
        StringJoiner sj = new StringJoiner(",","[","]");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = floor; i <= ceil; i++) {
            if (getDaffodilNum(i)) {
                sj.add("" + i);
            }
        }
        System.out.println(sj);

    }

    private static boolean getDaffodilNum(int num) {
        //获取新计算的数
        double newNum = 0;
        //用于保存原始数
        int hold = num;
        int count = 1;
        while(num / 10 != 0) {
            num /= 10;
            count++;
        }
        int[] arr = getNum(count, hold);
        for (int i = 0; i < arr.length; i++) {
            newNum += Math.pow(arr[i], count);
        }
        if (hold == newNum) {
            return true;
        } else {
            return false;
        }
    }

    private static int[] getNum(int count, int hold) {
        //获取每一位数放到数组里，从个位开始
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = hold % 10;
            hold /= 10;
        }
        return arr;
    }
}
