package hust.test2;

public class Test {
    public static void main(String[] args) {
        /*
        * final修饰基本数据类型，数据的值不会发生改变
        * fianl修饰引用数据类型，地址值不会改变，内部的属性值还是可以变化的*/

        final double PI = 3.14;
        final Student S = new Student();
        //s = new Student();

        final int[] ARR = {1, 2, 3};
        ARR[0] = 10;
        for (int i = 0; i < ARR.length; i++) {
            System.out.println(ARR[i]);
        }
    }
}
