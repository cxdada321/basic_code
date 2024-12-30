package hust.edu.jdk8datedemo;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdDemo {
    public static void main(String[] args) {
        //获取所有的时区ID
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds.size());

        //获取当前时区
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);

        //获取指定时区
        ZoneId zoneId1 = zoneId.of("Asia/Shanghai");
        System.out.println(zoneId1);
    }
}
