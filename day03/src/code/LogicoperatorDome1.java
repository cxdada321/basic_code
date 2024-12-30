package code;

public class LogicoperatorDome1 {
    public static void main(String[] args) {
        //并且&
        //两个条件同时满足，结果才为true
        System.out.println(true & true);
        System.out.println(true & false);

        //或者|
        //两个条件有一个满足，结果就为true
        System.out.println(true | true);
        System.out.println(true | false);

        System.out.println(
            "----------------------"
        );

        //细节
        //&&和&的区别
        //&&具有短路效果，如果第一个条件为false，后面的条件不再执行
        //&无短路效果，后面的条件继续执行

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        //||和|的区别
        //||具有短路效果，如果第一个条件为true，后面的条件不再执行
        //|无短路效果，后面的条件继续执行

        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println(
            "----------------------"
        );

        //短路运算符具有短路效果
        //左边表达式能够确定最终结果，那么右边就不会参与运行了
        int a = 10;
        int b = 10;
        boolean result = (++a < 5 ) && (++b < 5);
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);
    }
}
