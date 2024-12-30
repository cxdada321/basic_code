package stringbuilderdemo;

public class StringBuilderDemo3 {
    public static void main(String[] args) {
        //容量：最多装了多少
        //长度：已经装了多少
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("hellohellohellohellohellohellohellohellohellohellohellohellohellohellohellohellohellohellohellohellohellohellohellohellohellohellohellohellohellohello");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("hellohellohellohellohellohellohellohellohellohellohellohellohellohellohelloohellohellohellohellohellohellohellohelloh");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
    }
}
