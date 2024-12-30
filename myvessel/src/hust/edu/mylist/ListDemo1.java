package hust.edu.mylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo1 {
    public static void main(String[] args) {
        /*五种遍历方式
         * 迭代器
         * 列表迭代器
         * 增强for
         * Lambda
         * 普通for*/
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");

        /*Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }*/

        /*for (String s : list) {
            System.out.println(s);
        }*/

        //list.forEach(s -> System.out.println(s));

        /*for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }*/
        ListIterator<String> li = list.listIterator();
        while (li.hasNext()) {
            System.out.println(li.next());
        }

    }
}
