package sigletest;

public class AmountConversion {
    public static void main(String[] args) {
        /*金额转换
        * 定义一个方法，把传入的金额转换为汉字表示的字符串*/
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("请输入一个金额：");
        double money = sc.nextDouble();
        System.out.println(amountConversion(money));
    }
    public static String amountConversion(double money){
        String upperNum = "零壹贰叁肆伍陆柒捌玖";
        String upperUnit = "元拾佰仟万拾佰";
        String str = "";
        int[] arr = new int[upperUnit.length()];
        char[] arr1 = new char[upperUnit.length()];
        for (int i = 0; i < arr.length; i++) {

            if (money != 0) {
                //获取单个数字
                arr[i] = (int) (money % 10);
                money /= 10;
            } else {
                arr[i] = 0;
            }
            //获取对应的大写数字
            arr1[i] = upperNum.charAt(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            str += arr1[arr.length - 1 - i];
            str += upperUnit.charAt(arr.length - 1 - i);
        }
        return str;
    }
}
