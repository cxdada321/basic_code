package test.test1;

public class People {
    private String name;
    private int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public People() {
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

    public void keepPet(Animal a, String something) {
        if (a instanceof Dog d) {
            System.out.printf("年龄为%d的%s养了一只%s颜色的%d岁的狗", age, name, d.getColor(), d.getAge());
            System.out.printf("%d岁的%s颜色的狗两只前腿死死的抱住%s猛吃", d.getAge(), d.getColor(), something);
            System.out.println();
        } else if (a instanceof Cat c) {
            System.out.printf("年龄为%d的%s养了一只%s颜色的%d岁的猫", age, name, c.getColor(), c.getAge());
            System.out.printf("%d岁的%s颜色的猫眯着眼睛侧着头吃%s", c.getAge(), c.getColor(), something);
            System.out.println();
        } else {
            System.out.println("不是猫也不是狗");
        }
    }
}
