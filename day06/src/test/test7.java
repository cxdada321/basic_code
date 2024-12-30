package test;

public class test7 {
    public static void main(String[] args) {
        //需求：设计一个方法求数组的最大值，并将最大值返回
        int [] arr = {12, 45, 98, 73, 60};
        System.out.println("最大值为" + getMax(arr));
    }
    public static int getMax(int [] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

}
