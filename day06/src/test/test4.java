package test;

public class test4 {
    public static void main(String[] args) {
        //需求：定义方法，比较两个长方形的面积
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("请输入第一个长方形的长：");
        int length1 = sc.nextInt();
        System.out.println("请输入第一个长方形的宽：");
        int width1 = sc.nextInt();
        System.out.println("请输入第二个长方形的长：");
        int length2 = sc.nextInt();
        System.out.println("请输入第二个长方形的宽：");
        int width2 = sc.nextInt();
        int area1 =geatArea(length1, width1);
        int area2 =geatArea(length2, width2);
        if (area1 > area2) {
            System.out.println("第一个长方形的面积大");
        }else if(area1 == area2) {
            System.out.println("两个长方形的面积一样大");
        }else {
            System.out.println("第二个长方形的面积大");
        }
    }
    public static int geatArea(int length, int width){
        return length * width;
    }
}
