package cc.yhscy.create;

/**
 * @author ShiChun
 * @date 2022/12/7 12:03
 */
public class DynamicArray1 {
    //目标 ：掌握动态数组的使用
    public static void main(String[] args) {
        //定义一个int类型的动态数组
        int[] list = new int[5];
        list[0] = 1;
        System.out.println(list[0]);
        System.out.println(list[1]);
        System.out.println(list[2]);    //0

        //定义一个String类型的动态数组
        String[] nameList = new String[4];
        nameList[0] = "Shichun";
        nameList[1] = "GaoYuan";
        System.out.println(nameList[0]);
        System.out.println(nameList[1]);
        System.out.println(nameList[2]);  //null


    }
}
