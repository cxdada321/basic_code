package test;

public class Test6 {
    public static void main(String[] args) {
        /*数字加密
        * 某系统的数字密码（大于0），比如1983，采用加密方式进行传输
        * 规则：先得到每位数，然后每位数都加上5，再对10求余，最后将所有数字反转，得到一串新数*/
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("请输入一个大于0的数字：");
        int num = sc.nextInt();
        if (num <= 0) {
            System.out.println("输入错误！");
            return;
        }
        int [] arr = new int[getCount(num)];
        int count = getCount(num);
        for (int i = 0; i < count; i++) {
            arr[i] = num % 10;
            num /= 10;
        }
        arr = getNewNum(arr);
        System.out.println("加密后的数字为：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }
    public static int getCount(int num){
        int count = 0 ;
        while(num > 0){
            num /= 10;
            count++;
        }
        return count;
    }

    public static int[] getNewNum(int arr[]){
        int[] newarr= new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newarr[i] = (arr[i] + 5) % 10;
        }
        return newarr;
    }

}
