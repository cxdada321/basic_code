package arraydemo;

public class ArrayDemo1 {
    public static void main(String[] args) {
        //静态初始化
        //数据类型[] 数组名 = new 数据类型[]{元素1, 元素2, 元素3, ...};

        //定义数组存储5个学生的年龄
        int [] arr1 = new int[]{23, 23, 24, 25, 26};

        //存储姓名
        String [] arr2 = {"张三", "李四", "王五", "赵六", "田七"};

        System.out.println(arr1);//[I@b4c966a 地址值表示数组在内存的位置
        //[ ：表示数组
        //I：表示int类型
        //@：分隔符（固定格式）
        //b4c966a：表示数组在内存的位置（十六进制）
    }
}
