package staticdemo1;

public class StudentTest {
    public static void main(String[] args) {
        Student.teacherName = "Mr. Lee";
        Student stu = new Student("John", 20, '男');
        stu.study();
        stu.show();
    }
}
