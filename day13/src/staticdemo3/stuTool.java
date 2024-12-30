package staticdemo3;

import staticdemo2.ArrayUtil;

import java.util.ArrayList;

public class stuTool {
    private stuTool() {}
     public static ArrayList<Student> getAgemax(ArrayList<Student> list ) {
        ArrayList<Student> list1 = new ArrayList<>();
        int max = list.get(0).getAge();
        list1.add(list.get(0));
        for (int i = 1; i < list.size(); i++) {
             if (max < list.get(i).getAge()) {
                 max = list.get(i).getAge();
                 if (list.size() == 1) {
                     list1.set(0, list.get(i));
                 } else {
                     //重新加入一个更大数的时候清空前面的数据，重新放大数的数据
                     list1.clear();
                     list1.add(list.get(i));
                 }
                 /*for (int i1 = 1; i1 < list1.size(); i1++) {
                     list1.set(i1, list.get(i + 1));
                 }*/
             } else if(max == list.get(i).getAge()) {
                 list1.add(list.get(i));
                }
        }
        return list1;
     }
}
