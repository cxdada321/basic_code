package interfacedemo4;

public interface Inter {
    /*接口中默认方法的定义形式
     * public default 返回值类型 方法名（参数列表）{}
     * 接口中默认方法注意事项：
     *   1、默认方法不是抽象方法，所以不强制重写，但是如果重新要去掉default关键字
     *   2、public可以省略， default不可以
     *   3、如果实现了多个接口，那么接口中存在相同名字的默认方法，子类就必须对该方法进行重写*/
    public abstract void method();
    public default void show() {
        System.out.println("Inter接口中的默认方法");
    }
}
