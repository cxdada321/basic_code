package hust.edu.mysort;

public class InsertDemo {
    public static void main(String[] args) {
        /*
        * 插入排序：将0索引的元素到N索引的元素看作有序的，把N+1到最后看作无序
        * 遍历无序数据，将遍历到的元素插入适当位置，如果遇到相同的则插在后面*/
        int[] arr = {23, 45, 12, 78, 34, 56, 89, 10};
        int N = arr.length - 1;
        //判断无序索引从哪里开始
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                N = i;
                break;
            }
        }
        //外层循环控制遍历无序数据
        for (int i = N + 1; i < arr.length; i++) {
            int index = i;
            //内层循环控制插入有序数据，比较大小
            for (int j = index - 1; j >= 0; j--) {
                //如果无序数据小于有序数据，则交换位置
                if (arr[index] < arr[j]) {
                    int temp = arr[index];
                    arr[index] = arr[j];
                    arr[j] = temp;
                    index--;//交换位置后，无序数据索引减1
                }
            }
        }
        printArr(arr);
    }

    private static void printArr(int[] arr) {
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
