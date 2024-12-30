package hust.edu.mycollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo2 {
    public static void main(String[] args) {
        /*Colletion三种通用遍历
        * 迭代器
        * 增强for
        * lambda表达式
        *
        * 迭代器
        * Interator<E> interator 获取一个对象
        * hasNext() 判断当前位置是否有元素
        * next() 获取当前位置元素，移动指针*/

        //创建集合
        Collection<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        //获取迭代器，利用集合对象调用iterator方法获取迭代器对象
        //迭代器是一个接口，不能直接new对象，需要通过实现类对象获取
        //迭代器好比一个箭头，默认指向集合中的0索引位置
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
