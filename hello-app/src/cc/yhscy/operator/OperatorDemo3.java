package cc.yhscy.operator;

/**
 * @author ShiChun
 * @date 2022/12/4 21:33
 */
public class OperatorDemo3 {
    // 目标:+符号做连接符的使用

    public static void main(String[] args) {
        int a = 1;
        String name = "tony";
        System.out.println(a + name);

        String des = " is a man";
        System.out.println(name + des);

        char b = 'a';
        System.out.println(b + a); //98

        System.out.println(name + (a + b)); //tony98


    }
}
