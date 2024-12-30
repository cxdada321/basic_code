package test5;

public class PhoneTest {
    public static void main(String[] args) {
        /*对象数组3
        * 定义数组存储3部手机对象
        * 要求计算出三部手机平均价格*/
        java.util.Scanner sc = new java.util.Scanner(System.in);
        Phone[] phone = new Phone[3];
        for (int i = 0; i < 3; i++) {
            phone[i] = new Phone();
            System.out.println("请输入第" + (i + 1) + "部手机的品牌：");
            phone[i].setBrand(sc.next());
            System.out.println("请输入第" + (i + 1) + "部手机的价格：");
            phone[i].setPrice(sc.nextDouble());
            System.out.println("请输入第" + (i + 1) + "部手机的颜色：");
            phone[i].setColor(sc.next());
        }
        System.out.printf("三部手机平均价格是%s", (phone[0].getPrice() + phone[1].getPrice() + phone[2].getPrice())/ phone.length);
    }
}
