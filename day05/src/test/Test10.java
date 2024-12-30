package test;

public class Test10 {
    public static void main(String[] args) {
        /*需求：定义一个数组，存入1，2，3，4，5
         * 交换前：1，2，3，4，5
         * 交换后：5，4，3，2，1*/
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int temp;
        /*
        for (int i = 0; i < (arr.length / 2); i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

         */
        for(int i = 0,j = arr.length -1 ; i < j; i++,j--){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
