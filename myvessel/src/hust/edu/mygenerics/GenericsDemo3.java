package hust.edu.mygenerics;

import java.util.ArrayList;

public class GenericsDemo3 {
    public static void main(String[] args) {
        /*利用ListUtil工具添加多个集合的元素*/
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("张三");
        list1.add("李四");
        list1.add("王五");
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(23);
        list2.add(24);
        ArrayList<Double> list3 = new ArrayList<>();
        list3.add(12.34);
        ListUtil.add(list1);
        ListUtil.add(list2);
        ListUtil.add(list3);
        ListUtil.show();
    }
}
