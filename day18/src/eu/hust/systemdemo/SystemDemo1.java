package eu.hust.systemdemo;

public class SystemDemo1 {
    public static void main(String[] args) {
        /*
        * exit 终止当前运行java虚拟机
        * currentTimeMillis 返回当前系统的时间毫秒值
        * arraycopy（数据源数组，起始索引，目的地数组，起始索引，拷贝个数）*/

        //形参
        //0表示正常退出
        //1表示非正常退出
        //用于结束整个程序
        //System.exit(0);

        //可用于获取程序运行的时间
        /*long l = System.currentTimeMillis();
        System.out.println(l);*/

        //数组拷贝
        int[] src = {1, 2, 3, 4, 5};
        int[] dest = new int[10];
        System.arraycopy(src,0, dest,4, src.length - 2);
        for (int i = 0; i < dest.length; i++) {
            System.out.println(dest[i]);
        }
    }
}
