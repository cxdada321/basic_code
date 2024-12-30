package eu.hust.objectdemo;

import com.google.gson.Gson;

public class ObjectDemo4 {
    public static void main(String[] args) throws CloneNotSupportedException {
        //对象克隆
        User user1 = new User(1, "张三", "123456", "1.jpg", new int[]{1, 2, 3});

        //protected clone在Object类中，因为Object类是所有类的父类，所以所有类都可以调用clone方法
        //为什么不能直接调用，因为跨包访问时，protected 方法只能通过继承链访问，而不能直接通过实例调用
        //因此我们需要重写clone方法，然后调用
        //为什么要强转，因为clone方法返回的是Object类型，我们需要强转为User类型

        //细节：
        //1、重新Object里的clone方法
        //2、实现Cloneable接口
        //3、创建原对象并且调用方法

        //浅克隆是把基本数据类型和引用数据类型地址赋值过去，两个对象的引用数据类型指向同一个地址
        //深克隆是把基本数据类型和引用数据类型地址赋值过去，两个对象的引用数据类型指向不同的地址
        //Object中是浅克隆，要深克隆就要重写
        User user2 = (User) user1.clone();
        /*System.out.println(user1);
        for (int i = 0; i < 3; i++) {
            user2.getData()[i] = i + 100;
        }
        System.out.println(user2);*/


        //第三方的工具
        //1、第三方的代码导入项目中
        //2、编写代码
        Gson gson = new Gson();
        //把对象转换成json字符串
        String s = gson.toJson(user1);
        System.out.println(s);
        //把json字符串转换成对象
        User user = gson.fromJson(s, User.class);

        //修改user1中的内容，看前面克隆的对象会不会一起改变
        user1.getData()[0] = 100;

        //打印对象
        System.out.println(user1);
        System.out.println(user);

    }
}
