package hust.edu.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Test4 {
    public static void main(String[] args) throws ParseException {
        /*判断任意一个年份是闰年还是平年
        * 用jdk7和jdk8判断
        * 二月有29天
        * 一年有366天*/
        //jdk7();
        LocalDate ld = LocalDate.of(2019, 2, 1);
        if (ChronoUnit.DAYS.between(ld, ld.plusMonths(1)) == 29) {
            System.out.println("闰年");
        } else {
            System.out.println("平年");
        }
    }

    private static void jdk7() throws ParseException {
        String year = "2008";
        String year1 = Integer.parseInt(year) + 1 + "";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        Date d = sdf.parse(year);
        Date d1 = sdf.parse(year1);
        if ((d1.getTime() - d.getTime()) / 1000 / 60 / 60 / 24 == 366) {
            System.out.println("闰年");
        } else {
            System.out.println("平年");
        }
    }
}
