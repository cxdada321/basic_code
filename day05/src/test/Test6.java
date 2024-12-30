package test;

public class Test6 {
    public static void main(String[] args) {
        /*统计个数
         * 定义数组，1，2，3，4，5，6，7，8，9，10
         * 统计数组中共有多少被3整除的数字*/
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
