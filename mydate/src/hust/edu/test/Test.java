package hust.edu.test;

import hust.edu.jdk7datedemo.SimpleDateFormatDemo2;
import hust.edu.jdk8datedemo.ChronoUnitDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws ParseException {
        /*用代码实现活了多少天
        * 分别用jdk7和jdk8实现*/

        jdk7();

        jdk8();
    }

    private static void jdk8() {
        LocalDate ld = LocalDate.of(2000,5,20);
        LocalDate now = LocalDate.now();
        System.out.println(ChronoUnit.DAYS.between(ld,now));
    }

    private static void jdk7() throws ParseException {
        String birDay = "2000-05-20";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sdf.parse(birDay);
        long time = d.getTime();

        //获取当前时间的毫秒值
        long currentTime = System.currentTimeMillis();

        //计算时间差
        System.out.println((currentTime - time) / 1000 / 60 / 60 / 24);
    }
}
