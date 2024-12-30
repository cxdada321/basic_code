package oopextendsdemo7;

public class Teacher extends Empolee{
    public Teacher() {
    }

    public Teacher(String id, String name) {
        super(id, name);
    }
    @Override
    public void work() {
        System.out.println("上课");
    }
}
