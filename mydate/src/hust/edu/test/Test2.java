package hust.edu.test;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test2 {
    public static void main(String[] args) {
        /*实现parseInt方法
        * 要求：字符串中只能是数字不能有其他字符
        * 最少一位，最多10位
        * 0不能开头*/
        String str = "123453";
        System.out.println(parseInt(str));
    }

    private static int parseInt(String str) {
        //指定字符串的格式
        String str1 ="[1-9]\\d{0,9}";
        //换一个格式获取每一个数字
        Pattern p1 = Pattern.compile("\\d");
        Matcher m1 = p1.matcher(str);
        ArrayList<String> list = new ArrayList<>();
        if (str.matches(str1)) {
            //获取里面的每个数字并且保存到list中
            while (m1.find()) {
                list.add(m1.group());
            }
        } else {
            System.out.println("字符串不符合要求");
            return 0;
        }
        int sum = list.get(0).charAt(0) - '0';//把字符转成数字
        //重新计算数字
        for (int i = 1; i < list.size(); i++) {
            sum = sum * 10 + list.get(i).charAt(0) - '0';
        }
        return sum;
    }
}
