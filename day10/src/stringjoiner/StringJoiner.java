package stringjoiner;

public class StringJoiner {
    public static void main(String[] args) {
        //可以用来隔开数据
        java.util.StringJoiner sj = new java.util.StringJoiner(", ", "[", "]");
        int[] arr = {1, 2, 3, 4, 5};
        String str = new String();
        for (int i = 0; i < arr.length; i++) {
            str += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            //只能添加字符串
            sj.add(str.substring(i, i + 1));
        }
        System.out.println(sj);
    }
}
