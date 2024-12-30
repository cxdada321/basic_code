package test;

public class Test4 {
    public static void main(String[] args) {
        /*把一个数组中的元素复制到另一个新的数组中去*/
        int [] arr1 = new int [5];
        int [] arr2 = new int [5];
        java.util.Scanner s = new java.util.Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arr1[i] = s.nextInt();
            arr2[i] = arr1[i];
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(arr2[i]);
        }
    }
}
