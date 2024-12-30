package domain;

public class Teacher {
    private String name;
    private int age;
    private String content;

    public Teacher() {
    }

    public Teacher(String name, int age, String content) {
        this.name = name;
        this.age = age;
        this.content = content;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getContent() {
        return content;
    }

    public void teach() {
        System.out.println("用心教学");
    }
}
