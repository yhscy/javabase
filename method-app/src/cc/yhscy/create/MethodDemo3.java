package cc.yhscy.create;

/**
 * @author ShiChun
 * @date 2022/12/10 17:21
 */
public class MethodDemo3 {
    public static void main(String[] args) {
        //判断传入值是奇数数还是偶数
        check(10001);
    }

    public static void check(int num){
        if (num % 2 == 0){
            System.out.println(num + "是偶数");
        }
        else {
            System.out.println(num + "是奇数");
        }

    }
}
