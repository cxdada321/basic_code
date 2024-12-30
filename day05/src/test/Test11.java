package test;

public class Test11 {
    public static void main(String[] args) {
        /*需求：定义一个数组，存入1~5
        * 打乱数组中的所有数据的顺序*/
        int [] arr = {1, 2, 3, 4, 5};
        int temp;
        int number;
        java.util.Random r= new java.util.Random();
        for (int i = 0; i < arr.length; i++) {
            temp = arr[i];
            number = r.nextInt(5);
            arr[i] = arr[number];
            arr[number] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
