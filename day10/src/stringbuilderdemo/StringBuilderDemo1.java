package stringbuilderdemo;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        //创建对象
        StringBuilder sb = new StringBuilder("hello");

        //添加元素
        sb.append("world");
        sb.append("java");
        sb.append(2.3);
        System.out.println("sb:" + sb);

        //反转
        System.out.println(sb.reverse());
    }
}
