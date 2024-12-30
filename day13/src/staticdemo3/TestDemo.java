package staticdemo3;

import java.util.ArrayList;

public class TestDemo {
    public static void main(String[] args) {
        Student stu1 = new Student("John", '男', 20);
        Student stu2 = new Student("Mary", '女', 22);
        Student stu3 = new Student("Tom", '男', 22);
        Student stu4 = new Student("Jerry", '女', 22);
        Student stu5 = new Student("Mark", '女', 25);
        ArrayList<Student> list = new ArrayList<>();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);
        list.add(stu5);
        list = stuTool.getAgemax(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName() + " " + list.get(i).getGender() + " " + list.get(i).getAge());
        }
    }

}
