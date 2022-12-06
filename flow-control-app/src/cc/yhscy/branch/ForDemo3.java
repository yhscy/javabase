package cc.yhscy.branch;

/**
 * @author ShiChun
 * @date 2022/12/6 14:44
 */
public class ForDemo3 {
    public static void main(String[] args) {
        int total = 0;
        //方法一：
//        for (int i = 1; i <=10;i++){
//            if (i%2 > 0){
//                total += i;
//            }
//
//        }

        //方法二：
        for (int i = 1;i <= 10; i += 2){
            total += i;
        }
        System.out.println(total);

    }
}
