package oopextendsdemo6;

public class Cooker extends Empoler {
    public Cooker() {
    }

    public Cooker(String id, String name, double salary) {
        super(id, name, salary);
    }
    @Override
    public void work() {
        System.out.println("炒菜");
    }
}
