package hust.edu.mysort;

public class CountingSort {
    public static void main(String[] args) {
        //计数排序，创建一个最大最小值长度的数组，记录原数组中每个数出现的次数，然后再遍历这个数组，输出排序后的数组
        //但是这个排序只适用于整数，因为需要创建一个新数组，数组的长度是最大值和最小值的差值
        //并且十分浪费空间，只适用于max和min差值不大的情况
        int[] arr = {4, 2, 2, 8, 3, 3, 1};
        countingSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    private static void countingSort(int[] arr) {
        //获取最大最小值
        int max = arr[0], min = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }

       /* //创建一个新数组记录出现次数
        int[] newArr = new int[max - min + 1];

        //遍历原数组，记录出现次数
        for (int i : arr) {
            //这里的i - min是为了把原数组的值映射到新数组中
            newArr[i - min]++;
        }

        //遍历新数组，输出排序后的数组
        int index = 0;
        int[] res = new int[arr.length];
        for (int i = 0; i < newArr.length; i++) {
            while (newArr[i] != 0) {
                res[index] = i + min;
                index++;
                newArr[i]--;
            }
        }*/

        //通过累加计数数组确保稳定性，适用范围更广，但实现稍复杂。
        //对于要求较高的排序任务（如数据库记录、复杂数据结构），使用第二种方法更合适
        //倒序遍历原数组，确保相同值的元素按输入顺序出现在排序结果中


        // 创建计数数组并初始化
        int[] count = new int[max + 1];

        // 统计每个元素的出现次数
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // 对计数数组进行累加
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        // 构建排序后的数组
        int[] sortedArray = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            sortedArray[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        //把排序后的数组赋值给原数组
        System.arraycopy(sortedArray, 0, arr, 0, arr.length);
    }
}
