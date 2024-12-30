package test;

public class Test11 {
    public static void main(String[] args) {
        /*需求：知道珠穆朗玛峰最高海拔8848430毫米
        一张纸厚度0.1毫米，对折多少次，超过珠穆朗玛峰
         */
        double height = 0.1;
        int sum = 0;
        while(height < 8848430){
            height *= 2;
            sum++;
        }
        System.out.println( "对折" + sum + "次，超过珠穆朗玛峰" );
    }
}
