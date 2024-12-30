package comprehensivetest;

public class RomanNum {
    public static void main(String[] args) {
        /*转换罗马数字
        * 键盘录入字符串
        * 长度小于等于9
        * 只能是数字
        * 变为罗马数字
        * 罗马数字没有0，如果录入数字有0，就变成""*/
        String [] romanArr = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("请输入一个数字：");
        String num = sc.next();
        boolean flag = true;
        //判断输入的数字是否合法
        while (flag) {
            if (num.length() > 9) {
                System.out.println("输入的数字太大，请重新输入");
                num = sc.next();
            } else {
                for (int i = 0; i < num.length(); i++) {
                    if (num.charAt(i) < '0' || num.charAt(i) > '9') {
                        System.out.println("输入的数字不合法，请重新输入");
                        num = sc.next();
                        flag = true;
                        break;
                    } else {
                        flag = false;
                    }
                }
            }
        }
        //将数字转换为罗马数字
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num.length(); i++) {
            if (i < num.length() - 1) {
                //减去'0'的目的是为了将char类型的数字转换为int类型的数字
                sb.append(romanArr[num.charAt(i) - '0']).append(',');
            } else {
            sb.append(romanArr[num.charAt(i) - '0']);
            }
        }
        System.out.println("罗马数字为：" + sb);
    }
}

