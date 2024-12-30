package abstractdemo1;

public class Test {
    public static void main(String[] args) {
        Student s = new Student("John", 20);
        s.work();
        System.out.println(s.getName() + s.getAge());
    }
}
