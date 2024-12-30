package test;

public class Test12 {
    /*需求：给你一个整数x
    如果x是一个回文整数，打印true，否则打印false
    回文数指正序（从左向右）和倒序（从右向左）读都是一样的整数
    例如121，12321
     */
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("请输入一个整数：");
        int number = s.nextInt();
        int temp = 10;
        int count = 1;
        while(number / temp >= 1){
            temp *= 10;
            count++;
        }
        if (count % 2 == 0) {
            for (int i = 1; i <= (count / 2); i++) {
                if ((number / (int)Math.pow(10, count - i) % 10) !=
                        (number / (int)Math.pow(10, i - 1) % 10)) {
                    System.out.println("false");
                    return;
                }
            }
        } else if ((count + 1) % 2 == 0) {
            for (int i = 1; i <= (count / 2); i++) {
                if ((number / (int)Math.pow(10, count - i) % 10) !=
                        (number / (int)Math.pow(10, i - 1) % 10)){
                    System.out.println("false");
                    return;
                }
            }
        }

        System.out.println(count);
        System.out.println("true");
    }
}
