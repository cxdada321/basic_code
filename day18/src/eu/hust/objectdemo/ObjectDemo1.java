package eu.hust.objectdemo;

public class ObjectDemo1 {
    public static void main(String[] args) {
        /*
        * toString() 返回对象字符串表示形式
        * equals() 比较两个对象是否相同
        * clone() 对象克隆*/

        //1、toString()方法 返回对象字符串表示形式
        Object obj = new Object();
        System.out.println(obj);
        //为什么会冗余，因为println底层会调用对象的toString()方法，把对象变成字符串
        System.out.println(obj.toString());

        Student s = new Student("张三", 23);
        System.out.println(s.toString());

        //细节：toString()方法返回的字符串格式为：类名@对象的内存地址
        //System：类名
        //out：静态变量
        //System.out 获取打印的对象
        //println()：方法
        //参数：打印的内容
        //逻辑：
        //我们打印一个内容时，底层会调用对象的toString()方法，把对象变成字符串
        //然后打印在控制台上

        //思考：为什么要重写toString()方法？因为默认的toString()方法返回的是对象的内存地址，我们想要看到属性值
    }
}
