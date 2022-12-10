package cc.yhscy.create;

/**
 * @author ShiChun
 * @date 2022/12/10 17:09
 */
public class MethodDemo2 {
    public static void main(String[] args) {

        int sum = sum(10);
        System.out.println(sum);

    }
    //计算1- N的和并返回

    public static int sum(int n){
        int sum = 0;
        for(int i = 1;i <= n;i++){
            sum += i;

        }
        return sum;




    }

}
