package hust.edu.jdk7datedemo;

import java.time.ZoneId;
import java.util.Calendar;
import java.util.Set;

public class CalenderDemo1 {
    public static void main(String[] args) {
        //获取日历对象
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2019);
        cal.add(Calendar.YEAR, 1);
        System.out.println(cal.get(Calendar.YEAR));
    }

}
