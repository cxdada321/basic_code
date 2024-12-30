package eu.hust.regexdemo;

public class RegexDemo9 {
    public static void main(String[] args) {
        /*正则外部使用
        * 将字符串：我要学编编编编编编编编程程程程程程程
        * 替换为：我要学编程*/
        String str = "我要学编编编编编编编编程程程程程程程程";
        String regex = "(.)\\1*";
        System.out.println(str.replaceAll(regex, "$1")); // $1表示第一个括号里的内容
    }
}
