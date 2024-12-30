package test4;

public class Student {
    //属性
    private String name;
    private int age;

    //针对每个私有化成员变量，提供get和set方法
    //set方法：用于设置成员变量
    //get方法：用于对外提供成员变量

    //如果我们没有写任何构造方法，系统会默认给我们提供一个无参构造方法
    //如果我们写了一个构造方法，系统就不会给我们提供无参构造方法
    //构造方法的作用：用于给对象进行初始化
    public Student(){

    }
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }


    public void setName(String name){
        //局部变量表示测试类中调用方法传递过来的数据
        //左边表示成员变量的name
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        if (age >= 18 && age <= 30){
            this.age = age;
    }else {
        System.out.println("年龄不合法");
    }
    }
    public int getAge(){
        return age;
    }
}
