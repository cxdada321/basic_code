package eu.hust.regexdemo;

public class RegexDemo2 {
    public static void main(String[] args) {
        /*验证输入手机号、邮箱号和座机电话号是否满足条件*/
        String telNum = "12345678901";
        System.out.println(telNum.matches("1[0-9]{1,10}"));

        String email = "1311396301@qq.com";
        String email2 = "dajklnoia@google.com";
        String email3 = "djaoi231@hust.edu.cn";
        //这里用\\.是把.转义了再转，表示这里只能是.，而不是任意字符
        //或者把.com看成一组，表示出现一次或者两次

        String regex = ".{6,10}@[\\w&&[^_]]{2,10}(\\.[\\w&&[^_]]{2,10}){1,2}";//".{6,10}@[\\w&&[^_]]{2,10}\\.[\\w&&[^_]]{2,10}\\.?[\\w&&[^_]]*"
        System.out.println(email.matches(regex));
        System.out.println(email2.matches(regex));
        System.out.println(email3.matches(regex));

        String tel1 = "020-2231113";
        String tel2 = "0212231113";
        String tel3 = "020-22311";
        String tel4 = "0207-432432";

        String regex2 = "0\\d{2,3}-?\\d{5,7}";
        System.out.println(tel1.matches(regex2));
        System.out.println(tel2.matches(regex2));
        System.out.println(tel3.matches(regex2));
        System.out.println(tel4.matches(regex2));
    }
}
