package cc.yhscy.type;

/**
 * @author ShiChun
 * @date 2022/12/4 20:42
 */
public class TypeDemo2 {
    //目标:表达式的自动类型转化
    public static void main(String[] args) {
        byte a = 1;
        double b = 7.5;
        double c = a + b;
        System.out.println(c);

        //byte/short/char在表达中是直接转化成int类型参与运算。
        byte d = 2;
        int e = 3;
        int f = d + e;
        System.out.println(f);
    }
}
