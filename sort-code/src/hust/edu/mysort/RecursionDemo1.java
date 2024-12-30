package hust.edu.mysort;

public class RecursionDemo1 {
    public static void main(String[] args) {
        /*利用递归算法求5的次方*/
        System.out.println(getPower(5, 3));
        //利用递归算法算5的阶乘
        System.out.println(getFactorial(2));
        //心得：方法调用的时候参数要更加靠近出口
    }

    private static int getPower(int i, int j) {
        if (j == 1) {
            return i;
        } else {
            return i * getPower(i, j - 1);
        }
    }

    private static int getFactorial(int i) {
        if (i == 1) {
            return 1;
        } else {
            return i * getFactorial(i - 1);
        }
    }
}
