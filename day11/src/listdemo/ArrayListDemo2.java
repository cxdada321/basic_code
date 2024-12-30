package listdemo;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //增
        list.add("hello");
        list.add("world");

        //删 返回true or false
        boolean result = list.remove("hell");


        //根据索引删除，返回值被删除的元素
        String str = list.remove(0);

        //改
        list.set(0, "java");
        System.out.println(list);

        //查
        list.get(0);
        System.out.println(list.get(0));
        System.out.println(list.size());
    }
}
