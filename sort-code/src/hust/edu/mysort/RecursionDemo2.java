package hust.edu.mysort;

public class RecursionDemo2 {
    public static void main(String[] args) {
        /*计算1-100的和
        * 递归算法：
        * 核心：
        * 1、找出口
        * 2、找规律*/
        //int result = 0;
        //System.out.println(getSum(100, result));

        System.out.println(getCount(100));
    }

    private static int getCount(int i) {
        if (i == 1) {
            return 1;
        }
        return i + getCount(i - 1);
    }

    private static int getSum(int count , int result) {
        result += count;
        count--;
        while (count > 0) {
            result = getSum(count, result);
            break;
        }
        return result;
    }
}
