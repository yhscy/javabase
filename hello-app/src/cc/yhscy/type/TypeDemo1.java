package cc.yhscy.type;

/**
 * @author ShiChun
 * @date 2022/12/4 20:30
 */
public class TypeDemo1 {
    public static void main(String[] args) {
        //自动类型转化
        byte a = 12;
        int b = a;
        System.out.println(a);
        System.out.println(b);

        //char赋值给int类型
        char c = 'a';
        int d = c;
        System.out.println(c);
        System.out.println(d);

    }
}
