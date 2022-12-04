package cc.yhscy.variable;

import javax.swing.plaf.ScrollPaneUI;
import javax.swing.plaf.synth.SynthOptionPaneUI;

/**
 * @author ShiChun
 * @date 2022/12/4 15:26
 */
public class VariableDemo2 {
    public static void main(String[] args) {
        //字符变量存储的底层原理
        char name = 'a';
        System.out.println(name + 1);

        System.out.println("====二进制/八进制/十六进制写法=====");

        int a = 0B100;
        System.out.println("二进制对应的值是" + a);

        int b = 0141;
        System.out.println("八进制对应的值是" + b);

        int c = 0xFA;
        System.out.println("十六进制对应的值是" + c);

    }
}
