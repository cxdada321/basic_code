package test;

public class Test9 {
    public static void main(String[] args) {
        /*需求：生成10个1~100之间的随机数存入数组
        * 求出所有数据和
        * 求所有数据平均数
        * 统计有多少个数据比平均数小*/
        java.util.Random r = new java.util.Random();
        int sum = 0;
        double average = 0;
        int count = 0;
        int [] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100) + 1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print("第" + (i+1) + "数字是：" + arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        //为什么加强转，是为了是sum变成double类型，这样计算的值就会有小数，或者sum直接定义double
        //否则计算的值还是整数，变为double类型也只是加0，没有意义
        average = (double)sum / arr.length;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < average){
                count++;
            }
        }
        System.out.println("所有数据和是：" + sum);
        System.out.println("所有数据平均数是：" + average);
        System.out.println("比平均数小的数据有：" + count);
    }
}
