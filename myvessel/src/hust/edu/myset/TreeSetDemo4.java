package hust.edu.myset;

import java.util.Objects;
import java.util.TreeSet;

public class TreeSetDemo4 {
    public static void main(String[] args) {
        /*五个学生对象
        * 属性，姓名，年龄，语文，数学，英语
        * 总分由高到低
        * 一样按着语文，数学，英语，年龄，名字字母顺序排列
        * 如果都一样认为是同一学生，不存*/
        Student2 s1 = new Student2("aaa", 23, 87, 91, 99);
        Student2 s2 = new Student2("bbb", 24, 87, 90, 100);
        Student2 s3 = new Student2("ccc", 25, 88, 90, 99);
        Student2 s4 = new Student2("d", 23, 88, 90, 98);
        Student2 s5 = new Student2("d", 23, 88, 90, 98);
        TreeSet<Student2> set = new TreeSet<>();
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);
        set.forEach(student -> {
            System.out.println("总分是：" + (student.getChinese() + student.getMath() + student.getEnglish()));
            System.out.println(student);
        });

    }
}

class Student2 implements Comparable {
    private String name;
    private int age;
    private int chinese;
    private int math;
    private int english;

    public Student2() {
    }

    public Student2(String name, int age, int chinese, int math, int english) {
        this.name = name;
        this.age = age;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }


    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return chinese
     */
    public int getChinese() {
        return chinese;
    }

    /**
     * 设置
     * @param chinese
     */
    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    /**
     * 获取
     * @return math
     */
    public int getMath() {
        return math;
    }

    /**
     * 设置
     * @param math
     */
    public void setMath(int math) {
        this.math = math;
    }

    /**
     * 获取
     * @return english
     */
    public int getEnglish() {
        return english;
    }

    /**
     * 设置
     * @param english
     */
    public void setEnglish(int english) {
        this.english = english;
    }

    public String toString() {
        return "Student2{name = " + name + ", age = " + age + ", chinese = " + chinese + ", math = " + math + ", english = " + english + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student2 student2 = (Student2) o;
        return age == student2.age && chinese == student2.chinese && math == student2.math && english == student2.english && Objects.equals(name, student2.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, chinese, math, english);
    }

    @Override
    public int compareTo(Object o) {
        int total = ((Student2)o).getChinese() + ((Student2)o).getMath() + ((Student2)o).getEnglish();
        int total1 = this.chinese + this.math + this.english;
        int i = total - total1;
        i = i == 0 ? ((Student2)o).getChinese() - this.chinese : i;
        i = i == 0 ? ((Student2)o).getMath() - this.math : i;
        i = i == 0 ? ((Student2)o).getEnglish() - this.english : i;
        i = i == 0 ? ((Student2)o).getAge() - this.age : i;
        i = i == 0 ? ((Student2)o).getName().compareTo(this.name) : i;
        return i;
    }
}