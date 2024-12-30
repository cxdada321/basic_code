package test7;

import java.util.Objects;

public class StudentTest {
    public static void main(String[] args) {
        /*定义一个长度为3的数组，定义数组存储1~3学生对象作为初始数据
        * 学号 姓名 年龄
        * 再次添加一个学生对象，并在添加的时候进行学号唯一性的判断
        * 添加完毕后，遍历所有学生信息
        * 通过id删除学生信息，如果存在则删除，如果不存在，则提示删除失败
        * 删除完毕后，遍历所有学生信息
        * 查询数组id为"heima001"的学生，如果存在，则他的年龄 + 1*/
        Student[] arr = new Student[3];
        Student[] newarr = new Student[arr.length];
        //添加初始数据
        arr[0] = new Student("heima001", "张三", 23);
        arr[1] = new Student("heima002", "李四", 24);
        arr[2] = new Student("heima003", "王五", 25);

        //计算数组中有多少个学生对象
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null){
                count++;
            }
        }
        //添加新的学生对象
        Student newStu = new Student("heima005", "王六", 26);
        boolean flag = true;
        //判断学号是否重复
        for (int i = 0; i < arr.length; i++) {
            if (Objects.equals(newStu.getId(), arr[i].getId())) {
                flag = false;
                break;
            }
        }
        //如果学号不重复，则添加新的学生对象
        if (flag) {
            //判断数组是否已满
            if (count < arr.length){
                arr[count] = newStu;
                for (int i = 0; i < arr.length; i++) {
                    newarr[i] = arr[i];
                }
                count++;
            } else {
                newarr = getNewArr(arr, newStu);
                count++;
            }
            System.out.println("添加成功");
        } else {
            for (int i = 0; i < arr.length; i++) {
                newarr[i] = arr[i];
            }
            System.out.println("学号重复，无法添加");
        }

        printArr(newarr);
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("请输入要删除的学生学号：");
        String id = sc.next();
        flag = false;
        //删除学生信息
        for (int i = 0; i < count; i++) {
            if (Objects.equals(id, newarr[i].getId())){
                newarr[i] = null;
                count--;
                flag = true;
            }
        }

        if (flag == true){
            System.out.println("删除成功");
        } else {
            System.out.println("删除失败");
        }
        count = 0;
        for (int i = 0; i < newarr.length; i++) {
            if (newarr[i] != null){
                count++;
            }
        }
        System.out.println("删除完毕后的信息如下");
        printArr(newarr);
        //查询学号为"heima001"的学生

        id = "heima001";
        for (int i = 0; i < newarr.length; i++) {
            if (newarr[i] == null){
            } else {
                if (Objects.equals(id, newarr[i].getId())) {
                    newarr[i].setAge(newarr[i].getAge() + 1);
                }
            }
        }
        System.out.println("查询完毕后的信息如下");
        printArr(newarr);

    }

    public static void printArr(Student[] newarr) {
        for (int i = 0; i < newarr.length; i++) {
            if (newarr[i] == null){
                continue;
            }
            System.out.printf("学号：%s, 姓名：%s, 年龄：%d\n", newarr[i].getId(), newarr[i].getName(), newarr[i].getAge());
            System.out.println();
        }
    }

    public static Student[] getNewArr(Student[] arr, Student newStu) {
        Student[] newArr = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[newArr.length - 1] = newStu;
        return newArr;
    }
}
