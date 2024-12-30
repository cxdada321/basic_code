package hust.edu.test;

public class Test4 {
    public static void main(String[] args) {
        /*小明爬楼梯，有时候一次爬一步，有时候两步
        * 一共20个台阶，一共有多少爬法*/
        int num = 20;
        System.out.println(getSum(num));
    }

    private static int getSum(int num) {
        if (num == 1){
            return 1;
        } else if (num == 2) {
            return 2;
        }
        return getSum(num - 1) + getSum(num - 2);
    }
}
