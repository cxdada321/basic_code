package arraydemo;

public class ArrayDemo4 {
    public static void main(String[] args) {
        /*定义一个数组，用来存放50个学生名字
        * 名字未知，等报道后再添加*/
        String [] arr = new String [50];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = "学生" + (i + 1);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //数组默认初始化值
        //整数类型：0
        //小数类型：0.0
        //字符类型：'/u0000' 展示方式空格
        //布尔类型：false
        //引用类型：null
    }
}

