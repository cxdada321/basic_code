package hust.edu.mygenerics;


import java.util.Arrays;

//当编写一个类不知道类型的时候，就可以定义为泛型类
public class MyArrayList<E> {
    Object[] obj = new Object[10];
    int index = 0;

    /*E表示是不确定的类型，该类型在类后面已经定义了
    * e表示形参的名字，变量名*/
    public boolean add(E e) {
        obj[index] = e;
        index++;
        return true;
    }

    public E get(int index) {
        return (E)obj[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(obj);
    }
}
