package stringbuilderdemo;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        //创建对象
        StringBuilder sb = new StringBuilder("hello");

        //添加元素
        sb.append("world");
        sb.append("java");
        sb.append(2.3);

        //再把StringBuilder转换为String
        String str = sb.toString();
        System.out.println("str:" + str);
    }
}
