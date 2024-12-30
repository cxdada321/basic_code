package eu.hust.regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo5 {
    public static void main(String[] args) {
        /*爬取下面文本中的座机，邮箱，手机号，热线
        * 来黑马程序员学Java，
        * 手机号：18512516758，18512580807
        * 或者联系邮箱：boniu@itcast.cn,
        * 座机电话：01036517895，010-98951256，
        * 邮箱：bozai@itcast.cn，
        * 热线电话：400-618-9090，400-618-4000，4006184000，4006189090*/

        //手机正则：1[3-9]\\d{9}
        //邮箱：\\w+@\\w&&[^_]{2,6}(\\.\\w{2,6}){1,2}
        //座机号：(010|400)(-?\\d{3,4}|-?\\d{6,8}){1,2}

        String str = "来黑马程序员学Java，手机号：18512516758，18512580807，或者联系邮箱：boniu@itcast.cn，" +
                "座机电话：01036517895，010-98951256，邮箱：bozai@itcast.cn，热线电话：400-618-9090，400-618-4000，" +
                "4006184000，4006189090";
        Pattern p = Pattern.compile("(1[3-9]\\d{9})|\\w+@[\\w&&[^_]]{2,6}(\\.\\w{2,6}){1,2}" +
                "|(010|400)(-?\\d{3,4}|-?\\d{6,8}){1,2}");
        Matcher m = p.matcher(str);
        while(m.find()) {
            System.out.println(m.group());
        }
    }
}
