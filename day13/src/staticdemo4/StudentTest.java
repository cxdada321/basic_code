package staticdemo4;

public class StudentTest {
    public static void main(String[] args) {
        Student stu = new Student("John", 20);
        stu.printInfo();
        System.out.println("stu: " + stu);
        Student stu2 = new Student("Jane", 21);
    }
}
