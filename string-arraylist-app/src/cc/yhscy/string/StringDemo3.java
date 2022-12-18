package cc.yhscy.string;

/**
 * @author ShiChun
 * @date 2022/12/16 13:29
 */
public class StringDemo3 {
    public static void main(String[] args) {
        String a = "abc";
        String a1 = "a" + "b" + "c";
        System.out.println(a == a1);  //true.java存在编译优化机制，程序在编译时，直接转成"abc" ，主要目的是提升性能


        String aa = "abc";
        String ab = "ab";
        String aa1 = ab + "c";    //运算结果会存在堆内存，答案是false;
        System.out.println(aa1 == aa);

    }
}
