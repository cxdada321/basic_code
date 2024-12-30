package hust.edu.jdk7datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo2 {
    public static void main(String[] args) throws ParseException {
        /*
        * 对象生日是1999-1-25
        * 请用字符串表示这个数据，并将其转化为1999年1月25日*/
        String str = "1999-1-25";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日");
        Date d = sdf.parse(str);
        System.out.println(sdf1.format(d));
    }

}
