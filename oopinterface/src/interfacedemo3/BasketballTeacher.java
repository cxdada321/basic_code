package interfacedemo3;

public class BasketballTeacher extends People {
    public BasketballTeacher() {
    }

    public BasketballTeacher(String name, int age) {
        super(name, age);
    }
    @Override
    public void work() {
        System.out.println("教打篮球");
    }
}
