package sigletest;

public class ReplaceString {
    public static void main(String[] args) {
        /*字符串替换*/
        String str = "HelloWorld,TMD,CNM";
        //定义一个敏感词库
        String[] arr = {"TMD", "SB", "CAO", "CA", "CNM"};
        for (int i = 0; i < arr.length; i++) {
            str = str.replace(arr[i], "****");
        }
        System.out.println(str);

    }
}
