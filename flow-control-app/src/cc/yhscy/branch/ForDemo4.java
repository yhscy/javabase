package cc.yhscy.branch;

/**
 * @author ShiChun
 * @date 2022/12/6 21:02
 */
public class ForDemo4 {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++){
            for (int j = 0; j <=3; j++){
                System.out.println("我是第二次循环体");
            }
            System.out.println("我是第一次循环体");

        }
    }
}
