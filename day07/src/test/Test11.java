package test;

public class Test11 {
    public static void main(String[] args) {
        /*计算每个季度营业额和总的营业额*/
        java.util.Scanner s = new java.util.Scanner(System.in);
        double[][] arr = new double[4][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("请输入第" + (i + 1) + "季度" + "第" + (j + 1) + "个月" + "的营业额：");
                arr[i][j] = s.nextDouble();
            }
        }
        for (int i = 0; i < 4; i++) {
            System.out.println("第" + (i + 1) + "季度的营业额为：" + getSum(arr, i));
        }
        System.out.println("总的营业额为：" + getSum(arr));
    }
    public static double getSum(double[][] arr, int i){
        double sum = 0;
        for (int j = 0; j < arr[i].length; j++) {
            sum += arr[i][j];
        }
        return sum;
    }
    public static double getSum(double[][] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }
    
}
