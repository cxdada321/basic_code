package sigletest;

public class AppendString {
    public static void main(String[] args) {
        /*拼接字符串
        * 定义一个方法，把int数组中的数据按照指定格式拼接成一个字符串返回*/
        int[] arr = {1, 2, 3};
        System.out.println(getString(arr));
    }
    public static String getString(int[] arr){
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1){
                sb.append(arr[i]).append(",");
            } else {
                sb.append(arr[i]).append("]");
            }
        }
        return sb.toString();
    }
}
