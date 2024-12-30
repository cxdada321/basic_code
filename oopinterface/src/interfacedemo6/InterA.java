package interfacedemo6;

import interfacedemo4.Inter;

interface InterA {
    //public static void show1()
    public default void show1() {
        System.out.println("show1的方法开始执行");
        show3();
    }
    //public static void show2()
    public default void show2() {
        System.out.println("show2的方法开始执行");
        show3();
    }
    //普通的私有方法，给默认方法服务
    private void show3() {
        System.out.println("记录程序在运行过程中的各种细节，这里有100行代码");
    }
    //给静态方法服务
    /*private static void show4() {
        System.out.println("记录程序在运行过程中的各种细节，这里有100行代码");
    }*/
}
