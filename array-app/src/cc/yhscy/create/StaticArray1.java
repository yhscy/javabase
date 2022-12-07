package cc.yhscy.create;

/**
 * @author ShiChun
 * @date 2022/12/7 11:43
 */
public class StaticArray1 {
    //目标：掌握静态数组的使用
    public static void main(String[] args) {
        int[] list = {1,2,3,4,5};
        System.out.println(list[0]);
        System.out.println(list.length);

        //计算最大索引
        System.out.println(list.length - 1);
    }
}
