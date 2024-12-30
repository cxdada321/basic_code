package hust.edu.jdk8datedemo;

import java.time.LocalDate;

public class LocalDateDemo {
    public static void main(String[] args) {
        ///获取当前日期
        LocalDate date = LocalDate.now();
        System.out.println(date);

        //获取指定日期
        LocalDate date1 = LocalDate.of(2019, 10, 1);
        System.out.println(date1);

        //获取年月日
        System.out.println(date.getYear());
        //获取月是获取的对象是Month类型，方式一
        System.out.println(date.getMonthValue());
        //方式二
        System.out.println(date.getMonth().getValue());

        System.out.println(date.getDayOfMonth());
    }
}
