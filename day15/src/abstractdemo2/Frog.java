package abstractdemo2;

public class Frog extends Animal{
    public Frog(String name, int age) {
        super(name, age);
    }

    public Frog() {
    }
    public void eat() {
        System.out.println("吃虫子");
    }
}
