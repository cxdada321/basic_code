package test;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        /*定义一个集合，添加字符串，并进行遍历
        * 遍历格式参照：[元素1，元素2]*/
        StringBuilder str = new StringBuilder("dwadsafa");
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.substring(i, i + 1));
        }
        java.util.StringJoiner sj = new java.util.StringJoiner(",","[","]");
        for (int i = 0; i < list.size(); i++) {
            sj.add(list.get(i));
        }
        System.out.println(sj);
    }
}
