package oopextendsdemo7;

public class MainTainer extends Empolee {
    public MainTainer() {
    }

    public MainTainer(String id, String name) {
        super(id, name);
    }
    @Override
    public void work() {
        System.out.println("维修");
    }
}
