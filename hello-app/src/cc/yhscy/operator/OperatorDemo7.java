package cc.yhscy.operator;

import javax.crypto.spec.PSource;

/**
 * @author ShiChun
 * @date 2022/12/4 23:21
 */
public class OperatorDemo7 {
    //目标：掌握逻辑运算符的使用。
    public static void main(String[] args) {
        double price = 5000;
        int size = 16;

        double actPrice = 4000;
        int actSize = 8;

        System.out.println(price > actPrice & size > actSize); //true
        System.out.println(price > actPrice & size < actSize); //false
        System.out.println(price > actPrice | size < actSize); //true
        System.out.println(price > actPrice | size < actSize); //true
        //异或,两个条件不则为true
        System.out.println(price > actPrice ^ size < actSize); //true
        System.out.println(price > actPrice ^ size > actSize); //false

        System.out.println(" ======&& || 和 & | 的区别======");
        int a = 100;
        int b = 10;
        //当第一个条件成立，后面继续执行
//        System.out.println(a > 10 && b++ >10);  //true
//        System.out.println(b);
        //当第一个条件不成立，后面不执行
        System.out.println(a < 10 && b++ >10);   //false
        System.out.println(b);


        //双或，当一个条件成立，后面不执行
//        System.out.println( a > 10 || b++ >10);
//        System.out.println(b);

        System.out.println(a < 10 && b++ >10);
        System.out.println(b);



    }


}
