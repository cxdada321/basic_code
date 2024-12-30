package test3;

public class GirlFriend {
    //属性
    //成员变量
    private int age;

    public void method() {
        //局部变量，就近原则
        int age = 18;
        //this可以取到前面的成员变量
        System.out.println(this.age);
    }
}
