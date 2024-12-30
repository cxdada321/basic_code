package oopextendsdemo6;

public class Manager extends Empoler{
    double bonus;

    public Manager() {
    }

    public Manager(String id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }
    @Override
    public void work() {
        System.out.println("管理其他人");
    }
}
