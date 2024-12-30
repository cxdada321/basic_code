package oopextendsdemo6;

public class Test {
    public static void main(String[] args) {
        Cooker cooker = new Cooker("001", "John", 2000);
        Manager manager = new Manager("002", "Tom", 3000, 1000);
        cooker.work();
        cooker.eat();
        manager.work();
        manager.eat();
        System.out.println("cooker: " + cooker.id + " " + cooker.name + " " + cooker.salary);
        System.out.println("manager: " + manager.id + " " + manager.name + " " + manager.salary + " " + manager.bonus);
    }
}
