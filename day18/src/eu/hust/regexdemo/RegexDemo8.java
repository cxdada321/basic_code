package eu.hust.regexdemo;

public class RegexDemo8 {
    public static void main(String[] args) {
        //正则内部使用
        //利用分组，判断字符前后是否一致
        //最左边的括号是第一个就是第一组，第二个就是第二组
        String regex = "(.+).+\\1";//表示首尾相同
        String regex2 = "((.)\\2*).+\\1";//不仅相同，而且中间有重复的字符
        System.out.println("aaaaa123aaaaa".matches(regex2));
    }
}
