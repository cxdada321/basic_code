package test;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        /*基本数据类型包装类*/
        int[] arr = {1, 2, 3, 4, 5};
        //直接加入基本数据类型的时候 int 变为 Integer，字符就是char 变为 Character
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        java.util.StringJoiner sj = new java.util.StringJoiner(",","[","]");
        for (int i = 0; i < list.size(); i++) {
            //这里是为了把Integer类型转为String类型，因为StringJoiner只能添加字符串
            sj.add(list.get(i) + "");
        }
        System.out.println(sj);
    }
}
