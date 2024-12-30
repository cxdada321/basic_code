package sigletest;

public class JointString {
    public static void main(String[] args) {
        /*拼接字符串
        * 定义一个方法，把int数组中的数据按照指定的格式拼接成一个字符串返回*/
        int[] arr = {1, 2, 3};
        System.out.println(joint(arr));
    }
    public static String joint(int[] arr){
        String str = new String();
        str += "[";
        for (int i = 0; i < arr.length; i++) {
            str += arr[i];
            if (i < arr.length - 1){
                str += ", ";
            }
        }
        str += "]";
        return str;
    }

}
