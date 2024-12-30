package test;

public class Test10 {
    public static void main(String[] args) {
        /*需求：键盘录入两个数字，表示一个范围
        统计这个范围内
        既能被三整除，又能被五整除的数字有多少个
         */
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("请输入一个整数：");
        int i = sc.nextInt();
        System.out.println("请输入一个整数：");
        int j = sc.nextInt();
        int count = 0;
        if (i < j) {
            for (; i <= j; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    count += 1;
                    System.out.println(i);
                }
            }
        }else {
                    for (; j <= i; j++) {
                        if (j % 3 == 0 && j % 5 == 0) {
                            count += 1;
                            System.out.println(j);
                        }
                    }
                }


        System.out.println("这个范围内既能被三整除，又能被五整除的数字有：" + count + "个");
    }
}
