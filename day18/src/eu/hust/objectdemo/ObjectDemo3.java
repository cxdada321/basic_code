package eu.hust.objectdemo;

public class ObjectDemo3 {
    public static void main(String[] args) {
        //大厂面试题

        String s = "abc";
        StringBuilder sb = new StringBuilder("abc");
        System.out.println(s.equals(sb));//false
        //因为equals被s调用了，s是字符串，因此看String类的equals方法
        //String类的equals方法先比较是不是字符串，如果不是直接返回false


        System.out.println(sb.equals(s));//false
        //因为equals被sb调用了，sb是StringBuilder，因此看StringBuilder类的equals方法
        //StringBuilder类的equals方法继承于Object类，没有重写，比较的是两个对象的内存地址
    }
}
