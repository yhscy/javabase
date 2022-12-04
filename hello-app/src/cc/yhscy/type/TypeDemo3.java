package cc.yhscy.type;

/**
 * @author ShiChun
 * @date 2022/12/4 20:45
 */
public class TypeDemo3 {
    //目标:掌握强制类型转化

    public static void main(String[] args) {
        int a = 1;
        byte b = (byte) a;
        System.out.println();

        //强制类型转化导致数据溢出
        int i = 1500;
        byte c = (byte)i;
        System.out.println(c);

        //浮点数转整数
        float money = 9.5f;
        int cc = (int)money;
        System.out.println(cc);

        double price = 99.99;
        int dd = (int)price;
        System.out.println(dd);
    }

}
