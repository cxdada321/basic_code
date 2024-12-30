package hust.edu.jdk7datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo3 {
    public static void main(String[] args) throws ParseException {
        /*
        * 秒杀活动
        * 2023年11月11日 0:0:0开始
        * 2023年11月11日 0:10:0结束
        * 判断不同人下单时间有没有参加上活动*/
        String str = "2023年11月11日 0:0:0";
        String str2 = "2023年11月11日 0:10:0";
        String user = "2023年11月11日 0:15:0";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
        Date d1 = sdf.parse(str);
        Date d2 = sdf.parse(str2);
        if (sdf.parse(user).getTime() >= d1.getTime() && sdf.parse(user).getTime() <= d2.getTime()) {
            System.out.println("参加秒杀活动");
        } else {
            System.out.println("不参加秒杀活动");
        }
    }

}
