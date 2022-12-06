package cc.yhscy.branch;

import java.util.Random;
import java.util.Scanner;

/**
 * @author ShiChun
 * @date 2022/12/6 23:41
 */
public class RandomDemo1 {
    public static void main(String[] args) {
        //目标：学会使用random
        Random rm = new Random();
        int data = rm.nextInt(10);
        System.out.println(data);


        Scanner sc = new Scanner(System.in);
        //随机生成一个1-100之间的数据，提示用户猜测，猜大提示过大，猜小提示过小，直到猜中结束游戏
        while (true){

            int randomData = rm.nextInt(100) + 1;
            System.out.println("请输入数字：");
            int userInput = sc.nextInt();
            if (userInput > randomData){
                System.out.println("过大，重新猜测");
            }else if (userInput < randomData){
                System.out.println("过小，重新猜测");
            }else {
                System.out.println("恭喜猜中了！！！");
                break;
            }

        }





    }
}
