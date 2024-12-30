package test;

public class Test8 {
    public static void main(String[] args) {
        //求最值
        int [] arr = {1, 2, 3, 4, 5};
        //max里的值一定要是数组中的值
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
