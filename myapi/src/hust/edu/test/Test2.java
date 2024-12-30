package hust.edu.test;

public class Test2 {
    public static void main(String[] args) {
        /*不死神兔
        * 有一对兔子，从出生后第三个月每个月都生一对兔子，小兔子长到第三个月又每个月生一对兔子
        * 假如兔子都不死，问第十二个月的兔子对数是多少*/
        //特点：从第三个月开始，每个月的兔子对数是前两个月的兔子对数之和
        /*int month = 12;
        int[] arr = new int[month];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 1; i < arr.length - 1; i++) {
            arr[i + 1] = arr[i] + arr[i - 1];
        }
        System.out.println("第" + month + "个月的兔子对数是：" + arr[11]);*/

        //递归
        //规律和出口
        //F(12) = F(11) + F(10)
        //F(11) = F(10) + F(9)
        //F(10) = F(9) + F(8)
        //F(2) = 1
        //F(1) = 1
        int month = 12;
        System.out.println(getSum(month));
    }

    private static int getSum(int month) {
        if (month == 1 || month == 2) {
            return 1;
        }
        return  getSum(month - 1) + getSum(month -2);
    }
}
