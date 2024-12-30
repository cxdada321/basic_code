package hust.edu.search;
import java.util.ArrayList;
import java.util.Random;

public class HaxiSearchDemo {
    public static void main(String[] args) {
        /*在1~1000内获取100个随机数，要求数据不重复
        * 利用哈希查找*/
        Random r = new Random();
        ArrayList<Block> list1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Block block = new Block(1 + 100 * i, (i + 1) * 100);
            list1.add(block);
        }
        int count = 0;
        while (count != 100) {
            int num = r.nextInt(1000) + 1;
            for (Block block : list1) {
                if (num >= block.start && num <= block.end) {
                    if (block.arr.isEmpty()) {
                        block.arr.add(num);
                        count++;
                        System.out.println("不重复数据：" + num);
                        break;
                    } else {
                        for (int i2 = 0; i2 < block.arr.size(); i2++) {
                            if (num == block.arr.get(i2)) {
                                System.out.println("重复数据：" + num);
                                break;
                            } else if (i2 == block.arr.size() - 1) {
                                block.arr.add(num);
                                count++;
                                System.out.println("不重复数据：" + num);
                                break;
                            }
                        }
                    }

                }
            }
        }

        for (Block block : list1) {
            System.out.println(block.arr);
        }
        int sum = 0;
        for (int i = 0; i < list1.size(); i++) {
            sum += list1.get(i).arr.size();
        }
        System.out.println("总数：" + sum);



    }
    static class Block{
        int start;
        int end;
        ArrayList<Integer> arr;
        public Block(int i, int i1) {
            start = i;
            end = i1;
            arr = new ArrayList<>();
        }
    }

}
