package sigletest;

public class IdentificationCard {
    public static void main(String[] args) {
        /*身份证信息查看
        * 出生日期
        * 性别男/女*/
        //输入身份证号
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("请输入一个身份证号：");
        String id = sc.next();

        //创建变量
        String date = "";
        char gender = ' ';

        //截取出生日期
        date = id.substring(6,10) + "年" + id.substring(10,12) + "月" + id.substring(12,14) + "日";
        System.out.println(id.charAt(16) / 2);
        //这里是一个小技巧，因为char类型可以直接和int类型进行运算，所以可以直接将char类型转换为int类型
        if (id.charAt(16)  % 2 == 0) {
            gender = '女';
        } else {
            gender = '男';
        }
        System.out.println("出生日期：" + date);
        System.out.println("性别为" + gender);
    }
}
