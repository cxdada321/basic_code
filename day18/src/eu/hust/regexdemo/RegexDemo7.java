package eu.hust.regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo7 {
    public static void main(String[] args) {
        /*贪婪爬取和非贪婪爬取
        * Java自95年问世以来，abbbbbbbbaaaaaaaaaaa经历了许多版本，现在企业中用的最多的是Java8和Java11，
          因为这两个是长期支持版本，下一个长期支持版本是Java17，相信以后Java17也会登上舞台
          需求1：按照ab+的方式爬取ab，b尽可能多获取
          需求2：按照ab+的方式爬取ab，b尽可能少获取*/
        String str = "Java自95年问世以来，abbbbbbbbaaaaaaaaaaa经历了许多版本，现在企业中用的最多的是Java8和Java11"+
                "，因为这两个是长期支持版本，下一个长期支持版本是Java17，相信以后Java17也会登上舞台";
        //贪婪爬取，只写+和*，会尽可能多的获取
        //非贪婪爬取，只写+?和*?，会尽可能少的获取
        String regex3 = "ab+?";
        Pattern p = Pattern.compile(regex3);
        Matcher m = p.matcher(str);
        while(m.find()) {
            System.out.printf(m.group() + " ");
        }
    }
}
