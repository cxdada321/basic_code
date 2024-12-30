package hust.edu.jdk7datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo1 {
    public static void main(String[] args) throws ParseException {
        //SimpleDateFormat类的解析方法是返回一个Date对象

        //method();
        //定义一个字符串表示时间
        String str = "2016年12月18日 12时12分12秒";
        //细节：创建SimpleDateFormat对象时，要和字符串的格式一致
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date d = sdf.parse(str);
        System.out.println(d);

        //接着就可以用Date对象的方法进行操作，获取时间的毫秒值进行加减计算
    }

    private static void method() {
        //默认格式
        SimpleDateFormat sdf = new SimpleDateFormat();
        System.out.println(sdf.format(new Date()));

        //自定义格式
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒 E");
        System.out.println(sdf2.format(new Date()));
    }
}
