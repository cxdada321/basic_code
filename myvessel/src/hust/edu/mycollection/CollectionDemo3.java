package hust.edu.mycollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class CollectionDemo3 {
    public static void main(String[] args) {
        /*lambda表达式遍历：
        * foreach(Consumer<? super T> action)*/

        //创建集合
        Collection<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        /*//匿名内部类
        //底层原理
        //自己遍历集合，依次得到每一个元素
        //把得到的元素传递给下面的accept方法
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/

        //lambda表达式
        list.forEach(s -> System.out.println(s));


    }
}
