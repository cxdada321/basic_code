package abstractdemo2;

public abstract class Animal {
    private String name;
    private int age;
    public abstract void eat();
    public void drink() {
        System.out.println("喝水");
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

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal() {
    }
}
