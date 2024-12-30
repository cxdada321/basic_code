package eu.hust.systemdemo;

public class SystemDemo2 {
    public static void main(String[] args) {
        //细节：
        //1、源数组和目标数组如果都是基本数据类型，那么两者的类型必须保持一致，否则会报错
        //2、拷贝的时候要注意范围问题，否则会报错
        //3、如果两个数据都是引用数据类型，那么子类型可以赋值给父类型，但是父类型不能赋值给子类型
        /*int[] src = {1, 2, 3, 4, 5};
        //double[] dest = new int[10];
        int[] dest = new int[10];
        System.arraycopy(src,0, dest,4, src.length - 2);
        for (int i = 0; i < dest.length; i++) {
            System.out.println(dest[i]);
        }*/

        Student s1 = new Student("张三", 23);
        Student s2 = new Student("李四", 24);
        Student s3 = new Student("王五", 25);

        Student[] src = {s1, s2, s3};
        //Student[] dest = new Student[3];
        Person[] dest = new Person[3];

        //把src中对象的地址赋值给dest数组
        System.arraycopy(src, 0, dest, 0, src.length);
        for (int i = 0; i < dest.length; i++) {
            Student s = (Student) dest[i];//强制类型转换 ,大转小
            //System.out.println(dest[i].getName() + "..." + dest[i].getAge());
            System.out.println(s.getName() + "..." + s.getAge());
        }


    }
}


//写一个父类
class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
}

class Student extends Person {
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }
}
