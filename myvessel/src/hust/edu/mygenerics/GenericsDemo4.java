package hust.edu.mygenerics;

import java.util.ArrayList;

public class GenericsDemo4 {
    public static<E> void main(String[] args) {
        /*写一个泛型
         * 定义一个继承结构
         * 测试类定义一个方法用于饲养动物
         * 要求1：该方法能养所有品种的猫，但是不能养狗
         * 要求2：该方法能养所有品种的狗，但是不能养猫
         * 要求1：该方法能养所有品种的动物，但是不能传递其他类型*/
        Cat c1 = new bosiCat("波斯猫", 2);
        Cat c2 = new lihuaCat("狸花猫", 3);
        Dog d1 = new taidiDog("泰迪", 1);
        Dog d2 = new hashiqiDog("哈士奇", 2);
        ArrayList<Cat> list = new ArrayList<>();
        ArrayList<Dog> list2 = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        keepPet(list);
    }

    // 要求1：该方法能养所有品种的猫，但是不能养狗
    //遍历集合调用动物eat方法
    public static void keepPet(ArrayList<? extends Cat> list) {
        for (Cat cat : list) {
            cat.eat();
        }
    }
}

class Animal {
    private String name;
    private int age;

    public void eat() {
    }

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Animal{name = " + name + ", age = " + age + "}";
    }
}

class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

}

class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

}

class bosiCat extends Cat {
    public bosiCat() {
    }

    public bosiCat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.printf("一只叫做%s的，%d岁的波斯猫，正在吃小饼干", getName(), getAge());
    }
}

class lihuaCat extends Cat {
    public lihuaCat() {
    }

    public lihuaCat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.printf("一只叫做%s的，%d岁的狸花猫，正在吃鱼", getName(), getAge());
    }
}

class taidiDog extends Dog {
    public taidiDog() {
    }

    public taidiDog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.printf("一只叫做%s的，%d岁的泰迪，正在吃骨头", getName(), getAge());
    }
}

class hashiqiDog extends Dog {
    public hashiqiDog() {
    }

    public hashiqiDog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.printf("一只叫做%s的，%d岁的泰迪，正在吃骨头", getName(), getAge());
    }
}