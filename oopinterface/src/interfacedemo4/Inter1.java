package interfacedemo4;

public interface Inter1 {
    public default void show() {
        System.out.println("Inter1接口中的默认方法");
    }
}
