package hust.edu.mysort;

public class BubbleDemo1 {
    public static void main(String[] args) {
        /*冒泡排序
        * 如果有n个数，比较n-1轮，每轮比上一次少比较一次*/
        int[] arr = {23, 45, 12, 78, 34, 56, 89, 10};
        //外层循环控制比较轮数，n个数比较n-1轮
        for (int i = 0; i < arr.length - 1; i++) {
            //内层循环控制每轮比较次数，每轮比较次数比上一次少一次
            //-1是为了防止数组越界
            for (int i1 = 0; i1 < arr.length - i - 1; i1++) {
                int temp = arr[i1 + 1];
                arr[i1 + 1] = (arr[i1] > arr[i1 + 1]) ? arr[i1] : arr[i1 + 1];
                arr[i1] = (arr[i1] > temp) ? temp : arr[i1];
            }
        }
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
