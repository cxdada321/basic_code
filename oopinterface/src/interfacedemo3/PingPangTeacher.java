package interfacedemo3;

public class PingPangTeacher extends People {
    public PingPangTeacher() {
    }

    public PingPangTeacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println("教打乒乓球");
    }
}
