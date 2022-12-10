package cc.yhscy.create;

/**
 * @author ShiChun
 * @date 2022/12/10 16:26
 */
public class MethodDemo1 {
    public static void main(String[] args) {
        //目标：方法的使用
//        //张三
//        int a = 1;
//        int b = 2;
//        int c = a + b;
//        System.out.println(c);
//
//        //李四
//        int aa = 11;
//        int bb = 22;
//        int cc = a + b;
//        System.out.println(cc);

        int sum = add(1,2);
        System.out.println(
                sum
        );

        int sum1 = add(11,22);
        System.out.println(
                sum1
        );


    }
    public static int add(int a1,int b1){
        int c1 = a1 + b1;

        return c1;

    }
}
