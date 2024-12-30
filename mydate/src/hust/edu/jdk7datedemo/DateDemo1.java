package hust.edu.jdk7datedemo;

import java.util.Date;

public class DateDemo1 {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);

        System.out.println(new Date(0));

        d.setTime(1000L);
        System.out.println(d);

        long time = d.getTime();
        System.out.println(time);
    }
}
