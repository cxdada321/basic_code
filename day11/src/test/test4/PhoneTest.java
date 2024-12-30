package test.test4;

import java.util.ArrayList;

public class PhoneTest {
    public static void main(String[] args) {
        /*定义一个集合，存入三个手机对象
        * 定义一个方法，返回价格低于3000的手机信息*/
        ArrayList<Phone> list = new ArrayList<>();
        Phone phone1 = new Phone("华为", 2999);
        Phone phone2 = new Phone("小米", 1999);
        Phone phone3 = new Phone("苹果", 5999);
        list.add(phone1);
        list.add(phone2);
        list.add(phone3);
        ArrayList<Phone> list1 = findPrice(list);
        System.out.println("价格低于3000的手机有:");
        for (int i = 0; i < list1.size(); i++) {
            Phone phone = list1.get(i);
            System.out.printf("%s,价格为：%d", phone.getBrand(), phone.getPrice());
            System.out.println();
        }
    }
    public static ArrayList<Phone> findPrice(ArrayList<Phone> list) {
        ArrayList<Phone> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Phone ph = list.get(i);
            if (ph.getPrice() < 3000) {
                list1.add(ph);
            }
        }
        return list1;
    }

}
