package test;

public class Test5 {
    public static void main(String[] args) {
        /*遍历数组求和
        * 定义一个数组，1，2，3，4，5
        * 遍历数组得到每个元素，求和*/
        int [] arr ={1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}