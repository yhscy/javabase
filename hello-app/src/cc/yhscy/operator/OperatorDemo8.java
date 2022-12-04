package cc.yhscy.operator;

/**
 * @author ShiChun
 * @date 2022/12/4 23:47
 */
public class OperatorDemo8 {
    //目标掌握三元运算符的使用
    public static void main(String[] args) {
//        需求：定义三个整数，找出最大值并打印在控制台。
        int a = 1;
        int b = 2;
        int c = 3;

        int tmp = a > b? a:b;
        int max = tmp > c ? tmp:c;
        System.out.println("最大的整数是：" + max);


    }

}
