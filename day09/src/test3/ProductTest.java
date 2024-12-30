package test3;

public class ProductTest {
    public static void main(String[] args) {
        /*对象数组
        * 定义数组存储3个商品对象*/

        //这里创建数组要用Product类型
        Product[] arr = new Product[3];
        Product p1 = new Product("p1", 100, 10, 1);
        Product p2 = new Product("p2", 200, 20, 2);
        Product p3 = new Product("p3", 300, 30, 3);
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;
        for (int i = 0; i < 3; i++) {
            System.out.printf("商品名称是%s，价格是%s，数量有%s，标签是%s。",arr[i].getName(),arr[i].getPrice(),arr[i].getCount(),arr[i].getTitle());
            System.out.println();
        }
    }
}
