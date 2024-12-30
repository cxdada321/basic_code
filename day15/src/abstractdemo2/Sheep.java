package abstractdemo2;

public class Sheep extends Animal {
    public Sheep(String name, int age) {
        super(name, age);
    }

    public Sheep() {
    }
    public void eat() {
        System.out.println("吃草");
    }
}
