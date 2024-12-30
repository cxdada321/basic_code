package test;

public class Test3 {
    public static void main(String[] args) {
        /*需要：键盘录入一个正整数，判断该整数是否为一个质数
        质数：只能被1和它本身整除的数
         */
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int number = sc.nextInt();
        for (int i = 1; i < number; i++) {
            if (number == 1) {
                System.out.println(number + "不是质数");
                return;
            } else {
                if (number % i == 0 && i != 1) {
                    System.out.println(number + "不是质数");
                    return;
                }
            }
        }
        System.out.println(number + "是质数");

        /*如果不能用return，如何简化运行次数
        即用number的平方根来简化运行次数
        for(int i = 2; i <= Math.sqrt(number); i++){
            if(number % i == 0){
                flag = false;
                break;
            }
         */

        /*
        利用flag
        boolean flag = true;
        for(int i = 2; i < number; i++){
            if(number % i == 0){
                flag = false;
                break;
            }
        }
        if(flag == true){
            System.out.println(number + "是质数");
        }else{
            System.out.println(number + "不是质数");
        }

         */

    }
}
