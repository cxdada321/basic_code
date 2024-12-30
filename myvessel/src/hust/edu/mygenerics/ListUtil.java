package hust.edu.mygenerics;

import java.util.ArrayList;
import java.util.Arrays;

public class ListUtil {
    static Object[] obj = new Object[10];
    static int index = 0;

    //防止创建对象
    private ListUtil() {
    }

    public static <E> void add(ArrayList<E> e) {
        obj[index] = e;
        index++;
    }

    public static void show() {
        System.out.println(Arrays.toString(obj));
    }
}
