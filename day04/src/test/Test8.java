package test;

public class Test8 {
    public static void main(String[] args) {
        /*玩游戏网不好要短线重连
        断线重连要重复执行
        公司要求最多执行五次
         */
        for(int i = 1; i <= 5; i++){
            System.out.println("断线重连" + i);
        }
    }
}
