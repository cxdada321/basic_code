package staticdemo2;

import java.util.StringJoiner;

public class ArrayUtil {
    //私有化构造方法
    private ArrayUtil() {
    }
    public static String printArr(int[] arr) {
        StringJoiner sj = new StringJoiner(",","[","]");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            sj.add(sb.toString().substring(i,i+1));
        }
        return sj.toString();
    }
    public static double getAverage(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }
}
