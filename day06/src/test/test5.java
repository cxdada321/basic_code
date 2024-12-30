package test;

public class test5 {
    public static void main(String[] args) {
        /*需求：使用方法重载的思想，设计比较两个整数是否相同的方法
        * 要求：兼容全整数类型（byte，short，int，long）*/
        boolean byteresult = compare((byte)1, (byte)1);
        boolean intresult = compare((short)10, (short)20);
        boolean shortresult = compare(10, 10);
        boolean longresult = compare(10L, 20L);
        System.out.println(byteresult);
        System.out.println(intresult);
        System.out.println(shortresult);
        System.out.println(longresult);
    }
    public static boolean compare(byte a, byte b){
        System.out.println("byte");
        return a == b;
    }
    public static boolean compare(int a, int b){
        System.out.println("int");
        return a == b;
    }
    public static boolean compare(short a, short b){
        System.out.println("short");
        return a == b;
    }
    public static boolean compare(long a, long b){
        System.out.println("long");
        return a == b;
    }
}
