package hust.edu.jdk8datedemo;

import java.time.Instant;
import java.time.ZonedDateTime;
import java.time.ZoneId;

public class ZoneDateTimeDemo {
    public static void main(String[] args) {
        //获取当前时间，带时区
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);

        //获取指定时间，带时区
        ZonedDateTime zonedDateTime = ZonedDateTime.of(2019, 1, 1, 0, 0, 0,
                0, ZoneId.of("Asia/Shanghai"));

        //instant+ZoneId=ZonedDateTime
        Instant instant = Instant.ofEpochMilli(1000L);
        System.out.println(ZonedDateTime.ofInstant(instant, ZoneId.of("Asia/Shanghai")));

        //用with方法修改时间
        System.out.println(now.withYear(2018));

        //用plus方法修改时间
        System.out.println(now.plusYears(1));

        //细节：jdk8的时间类是不可变的，每次修改时间都会返回一个新的对象
    }
}
