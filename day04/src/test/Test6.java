package test;

public class Test6 {
    public static void main(String[] args) {
        /*键盘输入星期数，输出工作日和休息日
        1~5工作日，6~7休息日
         */
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("请输入一个整数：");
        int week = sc.nextInt();
        /*
        if(week < 1 || week > 7){
            System.out.println("输入的星期数无效");
            return; //结束程序
        }else{
            if(week >= 1 && week <= 5){
                System.out.println("工作日");
            }else{
                System.out.println("休息日");
            }
        }

         */

        switch(week){
            case 1,2,3,4,5 -> System.out.println("工作日");//case多天为一个值时，可以利用穿透性简化
            case 6,7 -> System.out.println("休息日");
            default -> System.out.println("输入的星期数无效");
        }
    }
}
