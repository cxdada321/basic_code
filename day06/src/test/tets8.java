package test;

public class tets8 {
    public static void main(String[] args) {
        //定义一个方法判断数组中一个数是否存在，将结果返回给调用处
        int [] arr = {12, 45, 98, 73, 60};
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("请输入要查找的数：");
        int number = sc.nextInt();
        System.out.println(judge(arr, number));
    }
    public static String judge(int [] arr, int a){
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            if (a == arr[i]){
                result =  "存在";
                break;
            }else
                result =  "不存在";
        }
        return result;

        //return break有什么区别
        //return是结束方法的执行，和循环没什么关系，表示1.返回结果 2.结束方法的执行
        //break是结束循环或者switch的执行，和方法没什么关系
    }
}
