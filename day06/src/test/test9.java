package test;

public class test9 {
    public static void main(String[] args) {
        /*需求：定义一个方法copyOfRange(int [] arr, int from, int to)
         * 功能：将数组arr中从索引from(包含)开始，到to（包含 ）结束的元素复制到新数组中，将新数组返回*/
        int[] arr = {11, 22, 33, 44, 55, 66, 77, 88, 99, 11, 22, 33, 44, 55, 66, 77, 88,};
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("请输入开始索引：");
        int from = sc.nextInt();
        System.out.println("请输入结束索引：");
        int to = sc.nextInt();
        int[] newArr = copyOfRange(arr, from, to);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]);
        }
    }
    public static int [] copyOfRange(int [] arr, int from, int to){
        int [] newarr = new int [to - from + 1];
        for (int i = 0, j = from; i<newarr.length; i++, j++){
            newarr[i] = arr[j];
        }
        return newarr;
    }
}
