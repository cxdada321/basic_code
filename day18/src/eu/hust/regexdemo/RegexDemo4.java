package eu.hust.regexdemo;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexDemo4 {
    public static void main(String[] args) {
        /*爬取数据
        * Java自95年问世以来，经历了许多版本，现在企业中用的最多的是Java8和Java11，
        * 因为这两个是长期支持版本，下一个长期支持版本是Java17，相信以后Java17也会登上舞台
        * 找出里面所有的JavaXX*/
        String str = "Java自95年问世以来，经历了许多版本，现在企业中用的最多的是Java8和Java11，" +
                "因为这两个是长期支持版本，下一个长期支持版本是Java17，相信以后Java17也会登上舞台";

        //Pattern:模式，正则表达式的编译表示形式
        //Matcher:文本匹配器，按照正则表达式的规则去读取字符串，从头开始读取
        //在大串中去寻找符合匹配规则的字串

        //获取正则表达式的对象
        Pattern p = Pattern.compile("Java\\d{0,2}");
        //获取匹配器
        //m：文本匹配器对象
        //p: 规则
        //str: 要匹配的字符串
        //m要在str中寻找符合p规则的字串
        Matcher m = p.matcher(str);

        //拿着文本匹配器对象去寻找符合规则的字串
        //没有就返回false
        //有就返回true，在底层记录字串的起始索引和结束索引+1
        boolean b = m.find();

        //方法底层会根据find方法记录的索引进行字符串的截取
        //subString(起始索引，结束索引)；包头不包尾，因此上面会+1

        while (b) {
            String s = m.group();
            System.out.println(s);
            //就会按着前面读取的索引继续读取
            b = m.find();
        }
    }
}
