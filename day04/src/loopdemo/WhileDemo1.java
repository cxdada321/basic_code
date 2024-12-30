package loopdemo;

public class WhileDemo1 {
    public static void main(String[] args) {
        //需求：利用while循环打印1~100

        //for循环：知道循环次数或者范围
        //while循环：不知道循环次数或者范围，但知道循环的终止条件
        int i =1;
        while(i <= 100){
            System.out.println(i);
            i++;
        }
    }
}
