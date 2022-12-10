package cc.yhscy.send;

/**
 * @author ShiChun
 * @date 2022/12/10 23:17
 */
public class ParamsDemo1 {
    //目标：基本类型的参数传递
    public static void main(String[] args) {
        int a = 10;
        change(10);
        System.out.println(a); //10

    }


    public static void change(int a){
        System.out.println(a);
        a = 20;
        System.out.println(a); //20
    }
}
