package oopextendsdemo3;

public class Test {
    public static void main(String[] args) {
        overSeaStu stu = new overSeaStu();
        stu.lunch();
    }
}

class Student {
    public void eat() {
        System.out.println("吃米饭");
    }
    public void drink() {
        System.out.println("喝矿泉水");
    }
}
class overSeaStu extends Student {
    public void lunch() {
        this.eat();
        this.drink();
        super.drink();
        super.eat();
    }

    //应用场景，当父类中的方法不能满足子类现在的需求时，就需要把这个方法重写
    @Override
    public void eat() {
        System.out.println("吃披萨");
    }
    @Override
    public void drink() {
        System.out.println("喝可乐");
    }
}
