package hust.edu.mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo1 {
    public static void main(String[] args) {
        /*
        * add
        * clear
        * remove
        * contains
        * isEmpty
        * size*/

        //Collection接口，不能直接创建对象，要创建实现类对象

        //为了学习Collection接口的方法，我们选择创建Collection接口的实现类对象
        Collection<String> coll = new ArrayList<>();

        //添加
        //细节1：调用list系列方法，返回值是boolean类型，一般情况下返回true，因为list允许元素重复
        //细节2：对于set系列方法，返回值是boolean类型，如果元素重复会返回false，因为set不允许元素重复

        coll.add("张三");
        coll.add("李四");
        coll.add("王五");
        //coll.clear();
        //注意：因为Collection里是共性的方法，所以不能通过索引删除，只能通过元素的对象删除
        //返回值是boolean类型，如果删除的元素不存在，返回false
        coll.remove("李四");
        System.out.println(coll);
        //细节，底层是依赖equals方法判断
        //如果是自定义对象，需要重写equals方法
        System.out.println(coll.contains("张三"));
    }
}
