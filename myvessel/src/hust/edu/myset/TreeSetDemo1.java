package hust.edu.myset;

import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args) {
        /*利用TreeSet存储整数并且排序*/
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(30);
        set.add(20);
        set.add(40);
        set.add(50);
        set.add(60);
        set.forEach(integer -> System.out.println(integer));
    }
}
