package oopextendsdemo6;

public class Empoler {
    String id;
    String name;
    double salary;

    public Empoler() {
    }

    public Empoler(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public void work() {
        System.out.println("工作");
    }
    public void eat() {
        System.out.println("吃米饭");
    }
}
