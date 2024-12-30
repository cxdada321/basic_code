package hust.edu.test;

import java.util.Arrays;

public class Test extends Peason {
    public static void main(String[] args) {
        /*定义数组存储一些人对象，利用Arrays排序
        * 要求1：属性有姓名、年龄、身高
        * 要求2：按照年龄大小排序，年龄一样，按照身高排序，身高一样按着姓名字母（不是字母个数）排序*/
        Peason p1 = new Peason("nihao", 23, 1.78);
        Peason p2 = new Peason("nihao", 24, 1.78);
        Peason p3 = new Peason("zb", 24, 1.78);
        Peason p4 = new Peason("vb", 24, 1.75);
        Peason[] arr = {p1, p2, p3, p4};


        /*Arrays.sort(arr,(o1, o2) -> {
            if (o1.getAge() == o2.getAge()) {
                if (o1.getHeight() == o2.getHeight()) {
                    return o1.getName().compareTo(o2.getName());
                } else {
                    return (int) (o1.getHeight() - o2.getHeight());//因为返回值是int，用强转会降低准确率，最好是用别的整数来代替
                }
            }
            return o1.getAge() - o2.getAge();
        });*/


        Arrays.sort(arr, (s1, s2) -> {
            double temp = s1.getAge() - s2.getAge();//用temp来切换比较的属性
            temp = temp == 0 ? s1.getHeight() - s2.getHeight() : temp;
            temp = temp == 0 ? s1.getName().compareTo(s2.getName()) : temp;
            //因为返回是整数类型，这样可以保证返回值是整数
            if (temp > 0) {
                return 1;
            } else if (temp < 0) {
                return -1;
            } else {
                return 0;
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}

class Peason {
    private String name;
    private int age;
    private double height;

    public Peason() {
    }

    public Peason(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
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
     * @return height
     */
    public double getHeight() {
        return height;
    }

    /**
     * 设置
     * @param height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    public String toString() {
        return "Peason{name = " + name + ", age = " + age + ", height = " + height + "}";
    }
}
