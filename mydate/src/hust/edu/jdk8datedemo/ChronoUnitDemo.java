package hust.edu.jdk8datedemo;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitDemo {
    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.of(2000, 5, 20, 5, 20, 0);
        System.out.println(time);

        //生日时间
        LocalDateTime birthday = LocalDateTime.of(1999, 1, 25, 5, 20, 0);
        System.out.println(birthday);

        //计算两个时间的差值
        System.out.println("相差的年数：" + ChronoUnit.YEARS.between(birthday, time));
        System.out.println("相差的月数：" + ChronoUnit.MONTHS.between(birthday, time));
        System.out.println("相差的天数：" + ChronoUnit.DAYS.between(birthday, time));
        System.out.println("相差的小时数：" + ChronoUnit.HOURS.between(birthday, time));
        System.out.println("相差的分钟数：" + ChronoUnit.MINUTES.between(birthday, time));
        System.out.println("相差的秒数：" + ChronoUnit.SECONDS.between(birthday, time));
        System.out.println("相差的毫秒数：" + ChronoUnit.MILLIS.between(birthday, time));


    }
}
