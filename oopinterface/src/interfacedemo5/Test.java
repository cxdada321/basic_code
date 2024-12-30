package interfacedemo5;

import interfacedemo4.Inter1;

public class Test {
    public static void main(String[] args) {
        /*
        * 接口中的静态方法定义格式：
        * public static 返回值类型 方法名（参数）{}
        * 注意事项：
        * 静态方法只能通过接口调用，不能用类名或者对象名调用
        * public可以省略，static不能省略*/
        InterImpl ii = new InterImpl();
        ii.method();
        //调用接口中的静态方法
        Inter.show();
    }
}
