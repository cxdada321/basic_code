package twodimensionarr;

public class TwoDimensionDemo1 {
    public static void main(String[] args) {
        //静态初始化
        //建议每个一维数组单独一行
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] arr1 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //获取数组中的元素
        //arr[0]是指获取第一个一维数组地址值
        System.out.println(arr[0][0]);
        for (int i = 0; i < arr.length; i++) {
            //获取每个一维数组地址值，重新计算一维数组长度
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        //动态初始化
        int[][] arr2 = new int[3][3];

        //动态初始化下如何创建一维数组维度不同的数组
        int[][] arr3 = new int[2][];
        int[] arr4 = {1, 2, 3};
        int[] arr5 = {4, 5};
        arr3[0] = arr4;
        arr3[1] = arr5;
        for (int i = 0; i < arr3.length; i++) {
            //获取每个一维数组地址值，重新计算一维数组长度
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.print(arr3[i][j] + "\t");
            }
            System.out.println();
        }
    }
}


