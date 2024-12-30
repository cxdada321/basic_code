package hust.edu.jdk8datedemo;


import java.time.Instant;
import java.time.ZoneId;

public class InstantDemo {
    public static void main(String[] args) {
        //获取当前时间戳
        //Instant now = Instant.now();
        //System.out.println(now);

        //根据时间毫秒值获取Instant对象
        Instant instant = Instant.ofEpochMilli(1000L);
        System.out.println(instant);

        System.out.println(Instant.ofEpochSecond(1L, 1000000000L));

        //指定时区
        //now和ofXXX是静态方法可以类名调用，其他方法要用对象调用
        System.out.println(Instant.now().atZone(ZoneId.of("Asia/Shanghai")));

        //判断两个时间戳的先后
        System.out.println(Instant.ofEpochMilli(1000L).isBefore(Instant.ofEpochMilli(2000L)));
        System.out.println(Instant.ofEpochMilli(1000L).isAfter(Instant.ofEpochMilli(2000L)));


    }
}
