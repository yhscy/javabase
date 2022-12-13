package cc.yhscy.special;

import javax.crypto.spec.PSource;
import java.util.Scanner;

/**
 * @author ShiChun
 * @date 2022/12/11 16:06
 */
public class CaseDemo1 {
    /*
    机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
    机票最终优惠价格的计算方案如下：旺季（5-10月）头等舱9折，经济舱8.5折，
                              淡季（11月到来年4月）头等舱7折，经济舱6.5折。

     */
    public static void main(String[] args) {

        while (true){
            System.out.println("=====欢迎来到机票打折系统======");
            System.out.println("请输入机票类型：1.头等舱 2.经济舱");
            Scanner sc = new Scanner(System.in);
            int type = sc.nextInt();
            System.out.println("请输入当前月份：1 一月 ，2 二月 以此类推");
            int month = sc.nextInt();
            System.out.println("请输入当前机票价格");
            double price = sc.nextDouble();
            System.out.println("系统开始计算...");

            switch (type){
                case 1:
                    System.out.println(discount1(price, month));
                    break;
                case 2:
                    System.out.println(discount2(price, month));
                    break;
            }

        }


    }
    //头等舱
    public static double discount1(double price,int month){
        int[] arrayMonth1 = {5,6,7,8,9,10};
        int[] arrayMonth2 = {11,12,1,2,3,4};

        double rs = 0;
        //淡季
        for (int i = 0; i <= arrayMonth1.length - 1; i++){
            if (arrayMonth1[i] == month){
                rs = price * 0.7;
                break;
            }
            else {
                System.out.println("结果有误，请重新输入！");
                return -1;
            }

        }
        //旺季
        for (int j = 0; j <= arrayMonth2.length -1; j++){
            if (arrayMonth1[j] == month){
                rs = price * 0.9;
                break;
            }else {
                System.out.println("结果有误，请重新输入！");
                return -1;

            }
        }

        System.out.println("当前的月份是" + rs);
        return rs;

    }

    //经济舱
    public static double discount2(double price,int month){
        int[] arrayMonth1 = {5,6,7,8,9,10};
        int[] arrayMonth2 = {11,12,1,2,3,4};

        double rs = 0;
        //淡季
        for (int i = 0; i <= arrayMonth1.length - 1; i++){
            if (arrayMonth1[i] == month){
                rs = price * 0.85;
                break;
            }

        }
        //旺季
        for (int j = 0; j <= arrayMonth2.length -1; j++){
            if (arrayMonth1[j] == month){
                rs = price * 0.65;
                break;
            }
        }
        return rs;

    }


}
