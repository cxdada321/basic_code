package sigletest;

public class test2 {
    public static void main(String[] args) {
        /*给定两个以字符串形式表示的非负整数num1和num2
         * 返回他们的乘积，乘积也表示为字符串的形式*/
        String num1 = "123";
        String num2 = "456";
        StringBuilder sb = new StringBuilder();
        sb.append(getNum(num1) * getNum(num2));
        System.out.println(sb);
    }
    public static int getNum(String num){
        int result = 0;
        for (int i = 0; i < num.length(); i++) {
            result *= 10;
            result += (num.charAt(i) - '0');
        }

        return result;
    }

}
