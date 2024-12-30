package staticdemo2;

public class TestDemo {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("字符串内容是：" + ArrayUtil.printArr(arr1));
        double[] arr2 = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};
        System.out.println("平均值是：" + ArrayUtil.getAverage(arr2));
    }
}
