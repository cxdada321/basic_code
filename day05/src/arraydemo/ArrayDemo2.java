package arraydemo;

public class ArrayDemo2 {
    public static void main(String[] args) {
        //利用索引对数组元素进行访问
        //数组的索引从0开始，到数组的长度-1结束

        //获取数组中的元素
        int [] arr = {11, 22, 33, 44, 55};
        System.out.println(arr[0]);

        //存储到数组中
        //格式：数组名[索引] = 值;

        arr[2] = 100;
        System.out.println(arr[2]);
    }
}
