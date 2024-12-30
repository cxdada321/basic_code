package eu.hust.runtimedemo;

import java.io.IOException;

public class RuntimedDemo1 {
    public static void main(String[] args) throws IOException {
        /*
        * public static Runtime getRuntime() 获取系统当前运行环境对象
        * public void exit() 停止虚拟机
        * public int availabProcessors() 获得的CPU线程
        * public long maxMemorry() JVM能从系统中获取总内存大小(byte)
        * public long totalMemorry() JVM已经从系统中获取总内存大小(byte)
        * public long freeMemorry() JVM剩余内存大小(byte)
        * pulic Process exec() 运行cmd命令
        * */

        //获取系统当前运行环境对象
        //Runtime r1 = Runtime.getRuntime();//getRuntime()方法是静态的，所以可以直接通过类名调用，存储的地址
        //Runtime r2 = Runtime.getRuntime();//getRuntime()方法是静态的，所以可以直接通过类名调用，存储的地址
        //System.out.println(r1 == r2);//true

        //exit()方法
        //Runtime.getRuntime().exit(0);

        //获取CPU线程
        //System.out.println(Runtime.getRuntime().availableProcessors());

        //获取JVM能从系统中获取总内存大小(byte)
        System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024 /1024 + "G");

        //获取JVM已经从系统中获取总内存大小(byte)
        System.out.println(Runtime.getRuntime().totalMemory() / 1024 / 1024 + "MB");

        //获取JVM剩余内存大小(byte)
        System.out.println(Runtime.getRuntime().freeMemory() / 1024 / 1024 + "MB");

        //运行cmd命令
        //shutdonw:关机
        //-s ：默认一分钟关机
        //-t ：设置时间 单位s
        //-a ：取消关机
        //-r ；重启
        //Runtime.getRuntime().exec("shutdown -s -t 3600");
        Runtime.getRuntime().exec("shutdown -a");
    }
}
