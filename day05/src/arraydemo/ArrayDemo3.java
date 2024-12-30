package arraydemo;

public class ArrayDemo3 {
    public static void main(String[] args) {
        //获取数组全部元素
        int [] arr = {11, 22, 33, 44, 55,32,5,6,7,2,32,134,5};
        /*
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }

         */

        //关于数组的长度属性，length
        //格式：数组名.length
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //拓展
        //自动的快速遍历数组
        //数组名.fori

    }
}
