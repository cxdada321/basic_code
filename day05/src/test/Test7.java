package test;

public class Test7 {
    public static void main(String[] args) {
        /*变化数据
        * 定义数组，1，2，3，4，5，6，7，8，9，10
        * 遍历每个元素
        * 要求：
        * 如果是奇数则扩大两倍
        * 如果是偶数则变为二分之一*/
        double [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1){
                arr[i] *= 2;
            }else{
                arr[i] /= 2;
            }
        }

        //一个循环尽量只做一件事情
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
