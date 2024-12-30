package hust.edu.myset;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo3 {
    public static void main(String[] args) {
        /*需求：请自行选择比较器排序和自然排序两种方式：
         * 要求：存入四个字符串，c,ab,df,qwer
         * 按照长度排序，相同再按着字母排序
         *
         * 比较器排序*/
        //o1表示当前要添加的元素
        //o2表示集合中已经存在的元素
        /*TreeSet<String> set = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }
                return o1.length() - o2.length();
            }
        });*/

        TreeSet<String> set = new TreeSet<>((o1, o2) -> {
            //利用三元比较符选择比较的结果
            int i = o1.length() - o2.length();
            i = i == 0 ? o1.compareTo(o2) : i;
            return i;
        });
        set.add("c");
        set.add("ab");
        set.add("df");
        set.add("qwer");

        set.forEach(str -> System.out.println(str));
    }
}
