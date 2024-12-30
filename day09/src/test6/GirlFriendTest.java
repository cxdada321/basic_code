package test6;

public class GirlFriendTest {
    public static void main(String[] args) {
        /*4个女朋友的对象
        * 姓名、年龄、爱好、性别
        * 计算平均年龄
        * 统计平均年龄比平均值的女朋友有几个，并把她们的信息打印出来*/
        GirlFriend[] arr = new GirlFriend[4];
        arr[0] = new GirlFriend("小红", 18, "唱歌", '女');
        arr[1] = new GirlFriend("小美", 20, "跳舞", '女');
        arr[2] = new GirlFriend("小丽", 22, "画画", '女');
        arr[3] = new GirlFriend("小芳", 24, "游泳", '女');
        double sum = 0;
        double age = 0;
        int count = 0;
        int[] index = new int[4];
        for (int i = 0; i < 4; i++) {
            sum += arr[i].getAge();
        }
        age = sum / 4;
        System.out.println("平均年龄为：" + age);
        for (int i = 0; i < 4; i++) {
            if (arr[i].getAge() < age) {
                index[count] = i;
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.println("姓名：" + arr[index[i]].getName() + " 年龄：" + arr[index[i]].getAge() + " 爱好：" + arr[index[i]].getHobby() + " 性别：" + arr[index[i]].getGender());
        }
    }
}
