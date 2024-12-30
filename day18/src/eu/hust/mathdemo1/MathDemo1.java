package eu.hust.mathdemo1;

public class MathDemo1 {
    public static void main(String[] args) {
        /*
        * abs 绝对值
        * ceil 向上取整
        * floor 向下取整
        * round 四舍五入
        * max 获取最大值
        * pow 幂
        * sqrt 平方根
        * cbrt 立方根
        * random 返回值为double的随机值，范围[0.0,1.0)*/
        System.out.println(Math.abs(-10));
        //bug:
        //int为例，取值范围为-2^31~2^31-1，即-2147483648~2147483647
        //如果没有负数与整数与之对应，那么取绝对值后会溢出
        int a = 10;
        int b = -10;
        //三元法比较a，b大小
        int c = a > b ? a : b;
        System.out.println(c);
        //数轴上向前向后移动
        System.out.println(Math.ceil(12.34));
        System.out.println(Math.floor(12.34));

        System.out.println(Math.round(12.34));
        System.out.println(Math.max(12, 34));

        System.out.println(Math.pow(2, 3));
        System.out.println(Math.sqrt(4));
        System.out.println(Math.cbrt(8));

        System.out.println(Math.random());
    }
}
