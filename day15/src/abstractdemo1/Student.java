package abstractdemo1;

public class Student extends People {
    public Student(String name, int age) {
        super(name, age);
    }

    public Student() {
    }

    @Override
    public void work() {
        System.out.println("Student is studying");
    }
}
