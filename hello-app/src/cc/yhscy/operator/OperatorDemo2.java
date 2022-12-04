package cc.yhscy.operator;

/**
 * @author ShiChun
 * @date 2022/12/4 21:16
 */
public class OperatorDemo2 {
    //需求：一个三位数123，将其拆分为个位、十位、百位后，打印在控制台
    public static void main(String[] args) {
        int a = 123;
        //个位
        System.out.println(a % 10);
        //十位
        System.out.println(a / 10 % 10);
        //百位
        System.out.println(a / 10 /10 );



    }
}
