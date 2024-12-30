package test;

public class Test2 {
    public static void main(String[] args) {
        /*键盘输入身上的钱数
        如果大于1000，输出“你是土豪”
        如果大于500，输出“你是富翁”
        如果大于100，输出“你是屌丝”
        如果小于100，输出“你是穷逼”
         */
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("请输入你身上的钱数：");
        int money = sc.nextInt();
        if(money > 1000){
            System.out.println("你是土豪");
        }else{
            if(money > 500){
                System.out.println("你是富翁");
            }else{
                if(money > 100){
                    System.out.println("你是屌丝");
                }else{
                    System.out.println("你是穷逼");
                }
            }
        }
    }
}
