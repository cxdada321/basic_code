package hust.edu.jdk7datedemo;

import java.util.Date;
import java.util.Random;

public class DateDemo2 {
    public static void main(String[] args) {
        /*打印时间原点开始一年之后的时间
        * 定义任意两个Date对象，比较一下哪个时间在前*/
        //printTime();
         campTime();
    }

    private static void campTime() {
        Random r = new Random();
        Date d1 = new Date(Math.abs(r.nextInt()));
        Date d2 = new Date(Math.abs(r.nextInt()));
        System.out.println(d1);
        System.out.println(d2);
        long time = d1.getTime() < d2.getTime() ? d1.getTime() : d2.getTime();
        System.out.println(new Date(time));
    }

    private static void printTime() {
        Date d1 = new Date(0);

        //获取d1时间的毫米值
        long time1 = d1.getTime();

        //在这个基础上再加一年的毫秒值
        time1 += 365 * 24 * 60 * 60 * 1000L;

        d1.setTime(time1);

        System.out.println(d1);
    }
}
