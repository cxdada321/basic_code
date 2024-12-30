package eu.hust.regexdemo;

public class RegexDemo3 {
    public static void main(String[] args) {
        /*
        * 验证用户名：大小写字母，数字，下划线一共4-16
        * 验证身份证号：18位，前17位任意数字，最后一位可以是数字可以是大写或者小写的x
        * 复杂要求，严格按照身份证格式*/
        String regex1 = "[a-zA-Z0-9_-]{4,16}";
        String userName = "dajklnoia*";
        String userName2 = "32189_ewoq_EUQI";
        System.out.println(userName.matches(regex1));
        System.out.println(userName2.matches(regex1));

        String regex2 = "[1-9]\\d{5}(18|19|20)\\d{2}(0[1-9]|10|11|12)(0[1-9]|[1-2]\\d|30|31)\\d{3}[\\dXx]";
        String idCard = "51232220000512778x";
        System.out.println(idCard.matches(regex2));

        //忽略数学的大小写
        String regex = "((?i)a)b(?i)c";//想要忽略哪部分，(?i)就放在哪部分前面，后面的如果不想忽略，就把前面的括起来
        System.out.println("abc".matches(regex));
        System.out.println("ABC".matches(regex));
    }
}
