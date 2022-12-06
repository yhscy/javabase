package cc.yhscy.branch;

/**
 * @author ShiChun
 * @date 2022/12/6 14:41
 */
public class ForDemo2 {
    //需求：求1-5之间的数据和，并把求和结果在控制台输出。

    public static void main(String[] args) {
        int total = 0;
        for (int i=1; i <= 5; i++){
            total += i;
        }
        System.out.println(total);

    }
}
