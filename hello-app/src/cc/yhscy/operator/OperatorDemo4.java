package cc.yhscy.operator;

/**
 * @author ShiChun
 * @date 2022/12/4 21:43
 */
public class OperatorDemo4 {
    public static void main(String[] args) {
        int a = 10;
        //自增，等同++a
        a++;
        System.out.println(a); //11
        //自减,等同--a
        a--;
        System.out.println(a); //10

        //在表达式，++/--在变量前后有明显区别
        int m =  100;
        int n = ++m;
        System.out.println(n); //101
        System.out.println(m); //101

        int j = 10;
        int k = j++;
        System.out.println(k); //10
        System.out.println(j);//11


        //验证
        int jj = 100;
        int kkk = jj++ + jj--;
        System.out.println(jj); //100
        System.out.println("--->" + kkk); //100 + 101 = 201


        System.out.println("=====面试题======");
        int kk = 3;
        int pp = 5;
        int rs = kk++ + ++kk - --pp + pp-- - kk-- + ++pp +2;
        /*
        实现步骤：
        kk  3 4 5 4
        pp  5 4 3 4
        rs  3 + 5 - 4 + 4 - 5 + 4 +2  = 9

         */


        System.out.println(kk);
        System.out.println(pp);
        System.out.println(rs);

    }
}
