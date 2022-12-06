package cc.yhscy.branch;

/**
 * @author ShiChun
 * @date 2022/12/6 21:14
 */
public class ForDemo5 {
    public static void main(String[] args) {
        //目标：搞清楚循环嵌套的原理
        //需求：在控制台使用 * 打印出4行5列的矩形
        for (int i = 1; i <= 4; i++){
            for (int j = 1; j <=5; j++){
                System.out.print("*"); //不换行

            }
            System.out.println();//换行


        }
    }
}
