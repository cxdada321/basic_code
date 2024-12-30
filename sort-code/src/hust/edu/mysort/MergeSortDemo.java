package hust.edu.mysort;

public class MergeSortDemo {
    public static void main(String[] args) {
        /*归并排序：
        * 递归拆分数组，直到数组长度为1
        * 之后合并数组，合并的时候排序
        * 核心思想：利用二分法递归把数组分成只含一个元素的小数组，再依次对小数组排序合并，由小到大排序整个数组*/
        int[] arr = {23, 12, 13, 78, 34, 56, 89, 100, 1, 0, -1, 1000};

        getArr(arr, 0, arr.length - 1);

        for (int i : arr) {
            System.out.println(i);
        }

        
    }

    private static void getArr(int[] arr, int left, int right) {
        //递归出口
        if (left < right) {
            int mid = (left + right) / 2;

            getArr(arr, left, mid);
            getArr(arr, mid + 1, right);

            //递归出来后合并数组
            mergeArr(arr, left, mid, right);
        }
    }

    private static void mergeArr(int[] arr, int left, int mid, int right) {
        //记录合并数组长度
        int length1 = mid - left + 1;
        int length2 = right - mid;
        //创建两个数组存放数据
        int[] leftArr = new int[length1];
        int[] rightArr = new int[length2];
        //把数据放到数组中
        for (int i = left; i < right + 1; i++) {
            if (i <= mid) {
                leftArr[i - left] = arr[i];
            } else {
                rightArr[i- mid - 1] = arr[i];
            }
        }

        //合并数组，加入排序
        int i = 0, j = 0;
        while(i < length1 && j < length2) {
            //这里的比较确定了排序的顺序
            if (leftArr[i] > rightArr[j]) {
                arr[left++] = leftArr[i++];
            } else {
                arr[left++] = rightArr[j++];
            }
        }

        //把剩下的数据放到数组中
        while (i < length1) {
            arr[left++] = leftArr[i++];
        }
        while (j < length2) {
            arr[left++] = rightArr[j++];
        }
    }
}
