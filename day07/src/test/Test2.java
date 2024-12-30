package test;

public class Test2 {
    public static void main(String[] args) {
        //判断101-200之间有多少个素数，并输出所有素数(质数)
        int a = 101;
        int b = 200;
        int count = 0;
        for (int i = a ; i <= b; i++) {
            boolean flag = judge(i);
            if (flag){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("101-200之间的素数有：" + count + "个");
    }
    public static boolean judge(int a){
        for(int i = 2; i <= Math.sqrt(a); i++){
            if (a % i == 0){
                return false;
            }
        }
        return true;
    }
}
