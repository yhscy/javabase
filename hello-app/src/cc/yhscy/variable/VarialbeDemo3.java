package cc.yhscy.variable;

/**
 * @author ShiChun
 * @date 2022/12/4 17:09
 */
public class VarialbeDemo3 {
    //数据类型的分类
    public static void main(String[] args) {
        // byte ,占1个字节，取值-128-127
        byte a = 126;
        System.out.println(a);

        //short,占2个字节，取值-32768-32767
        short b = 30000;
        System.out.println(b);

        //int（默认） ，占4个字节， 10位数
        int c = 31415926;
        System.out.println(c);

        //long ,8个字节，19位数
        //重点：java里整数字面量默认是int类型，若超过int的范围，需要添加l or L
        long d = 3141592653L;
        System.out.println(d);

        //float 4个字节，
        //重点：java里浮点数字面量默认是double类型，若报错，需添加f or F
        float money = 2.5F;
        System.out.println(money);

        //double(默认)，8个字节
        double score = 9.99;
        System.out.println(score);

        //char ,2个字节
        char e = 'h';
        System.out.println(e);

        //boolean,1个字节
        boolean res = true;
        System.out.println(res);

        //字符串
        System.out.println("====引用数据类型=====");
        String target = "把java学明白！！！";
        System.out.println(target);


    }
}
