package test.test3;
import java.util.ArrayList;

public class UserTest {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        User user1 = new User("1", "admin", "123456");
        User user2 = new User("2", "root", "123456");
        User user3 = new User("3", "test", "123456");
        list.add(user1);
        list.add(user2);
        list.add(user3);
        String id = "3";
        int result = 0;
        //查找id为2的用户对象是否存在
        for (int i = 0; i < list.size(); i++) {
            result = find(list.get(i), id , i);
            if (result == i){
                break;
            }

        }
        System.out.println(result);
    }
    public static int find(User user, String id, int i) {
        if (user.getId().equals(id)) {
            return i;
        } else {
            return -1;
        }
    }

}
