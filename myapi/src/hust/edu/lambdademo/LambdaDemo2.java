package hust.edu.lambdademo;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo2 {
    public static void main(String[] args) {
        /*省略规则
        * 1、参数类型省略不写
        * 2、如果只有一个参数，参数类型可以省略，（）可以省略
        * 3、如果lambda表达式方法体只有一行，大括号，分号，return都可以省略*/

        Integer[] arr = {1, 2, 3, 4, 5, 7, 9, 6};
        /*Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2; //升序
            }
        });*/

        //lambda表达式完整格式
        /*Arrays.sort(arr, (Integer o1, Integer o2) ->{
            return o2 - o1; //降序
        });*/

        //lambda表达式省略格式
        Arrays.sort(arr, (o1, o2) -> o2 - o1); //降序

        System.out.println(Arrays.toString(arr));
    }
}
