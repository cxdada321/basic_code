package test4;

public class CarTest {
    public static void main(String[] args) {
        /*对象数组
        * 定义数组存储3部汽车对象
        * 创建对象，数据通过键盘录入而来，并把数据存入到数组中*/

        //键盘录入
        //第一套体系
        //nextInt();接收整数
        //nextDouble();接收小数
        //next();接收字符串
        //遇到空格，制表符，回车就停止接受

        //第二套体系
        //nextLine();接收字符串
        //可以接受空格，制表符，遇到回车才会停止接受

        //键盘录入体系不能混用
        //比如nextInt()和nextLine()，nextInt()输入123 123，nextInt()会接收123，nextLine()会接收 空格+123+回车，遇到回车就停止接受，因此不能再对nextLine()录入

        java.util.Scanner sc = new java.util.Scanner(System.in);
        Car[] arr = new Car[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = new Car();
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入第" + (i + 1) + "部汽车的品牌：");
            arr[i].setLogo(sc.next());
            System.out.println("请输入第" + (i + 1) + "部汽车的颜色：");
            arr[i].setColor(sc.next());
            System.out.println("请输入第" + (i + 1) + "部汽车的价格：");
            arr[i].setPrice(sc.nextInt());
        }
        for (int i = 0; i < 3; i++) {
            System.out.printf("第%d部汽车的品牌是%s，颜色是%s，价格是%s。", i + 1, arr[i].getLogo(), arr[i].getColor(), arr[i].getPrice());
            System.out.println();
        }
    }
}
