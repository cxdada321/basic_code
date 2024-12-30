package hust.edu.test;


public class Test3 {
    public static void main(String[] args) {
        /*猴子吃桃子
        * 有一堆桃子，猴子第一天吃了一半，并且多吃了一个，以后每天都是这样吃，第十天的时候还没吃，发现只剩下一个
        * 最初有多少个桃子*/
        //D9 = 2*(D10 + 1) D10 = 1
        //D8 = 2*(D9 + 1)

        int day = 10;
        System.out.println(getSum(day));
    }

    private static int getSum(int day) {
        if (day == 1) {
            return 1;
        }
        return 2*(getSum(day - 1) + 1);
    }
}
