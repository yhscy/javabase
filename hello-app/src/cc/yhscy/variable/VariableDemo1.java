package cc.yhscy.variable;

/**
 * @author ShiChun
 * @date 2022/12/4 9:41
 */
public class VariableDemo1 {
    public static void main(String[] args) {
        //变量先申明再使用
        int age = 32;
        System.out.println(age);

/*        //变量申明后，不能存储其他类型的数据
        int name = "shichun";
        System.out.println(name);

        //变量的有效范围是从定义开始到“}”截止,且在同一个范围内部不能定义2个同名的变量
        {
            int gender = 1;
            int gender = 2;
        }
        System.out.println(gender);*/

        //变量定义的时候可以没有初始值，但是使用的时候必须给初始值。
        int c;
        c = 12;
        System.out.println(c);


    }
}
