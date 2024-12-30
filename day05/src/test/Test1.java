package test;

public class Test1 {
    public static void main(String[] args) {
        /*逢7过
        需求：在控制台输出1-100之间的所有不含7和7的倍数的数据
         */
        for(int i = 1; i <= 100; i++){
            if(i % 7 == 0 || i % 10 == 7 || i / 10 == 7){
                continue;
            }
            System.out.println(i);
        }
    }
}
