package hust.edu.search;

public class BlockSearchDemo {
    public static void main(String[] args) {
        /*
        * 块内无序，块间有序*/
        int[] arr = {7, 23, 79, 81, 99, 110, 104, 127, 131, 147};
        Block b1 = new Block(0, 2, 79);
        Block b2 = new Block(3, 6, 110);
        Block b3 = new Block(7, 9, 147);
        Block[] arr1 = {b1, b2, b3};
        int num = 110;
        for (int i = 0; i < arr1.length; i++) {
            if (num > arr1[i].max) {
                if (num <= arr1[i + 1].max) {
                    for (int i1 = 0; i1 < arr1[i + 1].end - arr1[i + 1].start + 1; i1++) {
                        if (num == arr[i1 + arr1[i + 1].start]) {
                            System.out.println("元素" + num + "在数组中的索引为：" + (arr1[i + 1].start + i1));
                            return;
                        }
                    }
                }
            } else {
                for (int i1 = 0; i1 < arr1[i].end - arr1[i].start + 1; i1++) {
                    if (num == arr[i1]) {
                        System.out.println("元素" + num + "在数组中的索引为：" + (arr1[i].start + i1));
                        return;
                    }
                }
            }
        }
    }
    static class Block{
        int start;
        int end;
        int max;

        public Block(int i, int i1, int i2) {
            start = i;
            end = i1;
            max = i2;
        }
    }
}
