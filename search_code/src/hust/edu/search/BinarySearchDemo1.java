package hust.edu.search;

public class BinarySearchDemo1 {
    public static void main(String[] args) {
        /*二分查找
        * 核心：每次排除一半范围
        * 要求：定义一个方法查询某个元素在数组中的索引*/
        int[] arr = {7, 23, 79, 81, 99, 103, 103, 127, 131, 147};
        int searchNum = 1;
        int index = binarySearch(searchNum, arr);
        System.out.println("元素" + searchNum + "在数组中的索引为：" + index);
    }

    private static int  binarySearch(int searchNum, int[] arr) {
        int max = arr.length - 1;
        int min = 0;
        int mid = (max + min) / 2;
        int index = -1;
        if (searchNum >= arr[0] && searchNum <= arr[arr.length - 1]) {
            while (mid != max) {
                if (searchNum < arr[mid]) {
                    max = mid - 1;
                    mid = (max + min) / 2;
                } else if (searchNum > arr[mid]) {
                    min = mid + 1;
                    mid = (max + min) / 2;
                } else {
                    index = mid;
                    break;
                }
            }
            if (mid == max) {
                index = mid;
            }
        }
        return index;
    }
}
