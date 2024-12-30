package staticdemo1;

public class Student {
    private String name;
    private int age;
    private char gender;
    public static String teacherName;
    public Student() {
    }

    public Student(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void study() {
        System.out.println("Student is studying");
    }

    public void show() {
        System.out.println("name: " + name + ", age： " + age + ", gender： " + gender + ", teacherName： " + teacherName);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
