package cc.yhscy.branch;

/**
 * @author ShiChun
 * @date 2022/12/6 17:51
 */
public class WhileDemo1 {
    public static void main(String[] args) {
        //目标：掌握while循环的使用
        int i = 0;
        while (i < 10){
            System.out.println("hello");
            i++;

        }

        //世界最高山峰是珠穆朗玛峰(8848.86米=8848860毫米)，假如我有一张足够大的纸，它的厚度是0.1毫米。请问，折叠多少次，可以折成珠穆朗玛峰的高度。

        double ply = 0.1;
        int ii = 0;
        while (ply <= 8848860){
            ply *= 2;
            ii++;
        }
        System.out.println(ii);
    }
}
