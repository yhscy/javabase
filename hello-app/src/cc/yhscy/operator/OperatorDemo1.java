package cc.yhscy.operator;

/**
 * @author ShiChun
 * @date 2022/12/4 21:08
 */
public class OperatorDemo1 {
    //目标：掌握基本运算符的使用
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);

        //两个整数相除，结果一定是整数，最高类型是整数
        System.out.println(a / b); //3
        //要想结果精准，这么处理，原理是：在表达式中，小范围类型的变量会自动转换成当前较大范围的类型再运算
        System.out.println(a * 1.0 / b);

        System.out.println(a % b);
    }
}
