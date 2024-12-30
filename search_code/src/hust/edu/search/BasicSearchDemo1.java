package hust.edu.search;

import java.util.ArrayList;

public class BasicSearchDemo1 {
    public static void main(String[] args) {
        /*查询某个元素在数组中的索引
        * 需要考虑数组中元素有重复的可能性*/
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 3, 3, 4, 3};
        int searchNum = 3;
        ArrayList<Integer> list = getIntegers(arr, searchNum);
        System.out.println("元素" + searchNum + "在数组中的索引为：" + list);
    }

    private static ArrayList<Integer> getIntegers(int[] arr, int searchNum) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (searchNum == arr[i]) {
                list.add(i);
            }
        }
        return list;
    }
}
