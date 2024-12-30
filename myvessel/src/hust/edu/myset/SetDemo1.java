package hust.edu.myset;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo1 {
    public static void main(String[] args) {
        /*利用Set集合添加字符串
        * 并通过多种方式遍历
        * 迭代器
        * 增强for
        * Lambda*/
        Set<String> set = new HashSet<>();
        set.add("hello");
        set.add("world");
        set.add("java");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (String s : set) {
            System.out.println(s);
        }

        set.forEach(str -> System.out.println(str));
    }
}
