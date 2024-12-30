package hust.edu.mysort;

public class QuickSortDemo {
    public static void main(String[] args) {
        /*快速排序：
        * 第一轮以0索引在的数字为基准数
        * 比基准数小的在左边，大的在右边
        * 之后的每轮就在剩余没有排序的的各部分重复过程，即确定左边的范围和右边的范围*/
        int[] arr = {23, 12, 13, 78, 34, 56, 89, 100};

        getArr(arr, 0, arr.length - 1);

        printArr(arr);
    }

    private static void getArr(int[] arr, int i, int j) {
        //把范围记录下来方便不同范围的排序
        int start = i;
        int end = j;

        int standard = arr[start];

        //递归出口
        if (start >= end) {
            return;
        }

        //一轮排序
        while (start <= end) {
            if (arr[end] > standard) {
                end--;
            } else {
                if (arr[start + 1] < standard) {
                    start++;
                } else {
                    reSort(start + 1, end, arr);
                }
            }
        }
        //为什么是和end换，因为最后end停的地方和start是一样的，start的地方是基准数或者比基准数小的数
        reSort(i, end, arr);

        getArr(arr, i, end - 1);//左边部分，为什么这里不能是0，原因是右分区再分的时候，分出来的左分区的start就不是0了

        getArr(arr, end + 1, arr.length - 1);//右边部分



    }

    private static void printArr(int[] arr) {
        for(int i: arr) {
            System.out.println(i);
        }
    }

    private static int[] reSort(int start, int end, int[] arr) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        return arr;
    }
}
