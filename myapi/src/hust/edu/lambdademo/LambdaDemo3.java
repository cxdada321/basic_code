package hust.edu.lambdademo;

import java.util.Arrays;

public class LambdaDemo3 {
    public static void main(String[] args) {
        /*定义数组并存储一些字符串，利用Arrays方法排序
        * 要求：
        *   按照字符串长度进行排序，短的在后面
        *   暂时不比较内容*/
        String[] arr = {"abc", "a", "abcd", "abcde", "abcdef"};
        Arrays.sort(arr,(s1, s2) -> s1.length() - s2.length());
        System.out.println(Arrays.toString(arr));
    }
}


