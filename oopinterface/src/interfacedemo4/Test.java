package interfacedemo4;

public class Test {
    public static void main(String[] args) {
        /*接口中默认方法的定义形式
        * public default 返回值类型 方法名（参数列表）{}
        * 接口中默认方法注意事项：
        *   1、默认方法不是抽象方法，所以不强制重写，但是如果重新要去掉default关键字
        *   2、public可以省略， default不可以
        *   3、如果实现了多个接口，那么接口中存在相同名字的默认方法，子类就必须对该方法进行重写
        *      如果不重写，调用的时候就不知道用的是哪个接口的方法，因为多个接口有重名的方法*/
        InterImpl ii = new InterImpl();
        ii.method();
        ii.show();
    }
}
