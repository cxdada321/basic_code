package eu.hust.regexdemo;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo6 {
    public static void main(String[] args) {
        /*有条件爬取数据
        * Java自95年问世以来，经历了许多版本，现在企业中用的最多的是Java8和Java11，
          因为这两个是长期支持版本，下一个长期支持版本是Java17，相信以后Java17也会登上舞台
          需求1：爬取版本号位8，11，17的Java版本，但是只要Java，不显示版本号
          需求2：爬取版本号位8，11，17的Java版本，显示版本号，正确爬取结果为Java8 Java11 Java17 Java17
          需求3：爬取除了版本号为8，11，17的Java文本
          * */
        String str = "java自95年问世以来，经历了许多版本，现在企业中用的最多的是Java8和Java11，" +
                "因为这两个是长期支持版本，下一个长期支持版本是Java17，相信以后Java17也会登上舞台";
        //?理解为前面的数据Java
        //=表示后面跟随的数据
        //但是获取时只获取前面的数据
        String regex1 = "Java(?=8|11|17)";
        //:表示拼接上后面的数据
        String regex2 = "Java(?:8|11|17)";
        //！表示后面数据是这样的都不要
        String regex3 = "(?i)Java(?!8|11|17)";
        Pattern p = Pattern.compile(regex1);
        Matcher m = p.matcher(str);
        while(m.find()) {

            System.out.printf(m.group() + " ");
        }

    }
}
