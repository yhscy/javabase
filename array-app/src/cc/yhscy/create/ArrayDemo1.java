package cc.yhscy.create;

/**
 * @author ShiChun
 * @date 2022/12/7 23:08
 */
public class ArrayDemo1 {
    //目标：掌握数组的遍历,实现元素求和
    public static void main(String[] args) {
        int[] socre = {1,3,5,7,9};
        int sum = 0;
        for (int i = 0; i <= socre.length - 1; i++){
            System.out.println(socre[i]);
            sum += socre[i];

        }
        System.out.println("sum:" + sum);
    }
}
