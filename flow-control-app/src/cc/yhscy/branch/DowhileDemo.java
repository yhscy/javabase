package cc.yhscy.branch;

import java.util.Scanner;

/**
 * @author ShiChun
 * @date 2022/12/6 18:09
 */
public class DowhileDemo {
    public static void main(String[] args) {
//        int i = 0;
//        do {
//            System.out.println("hello,man");
//            i++;
//        }while (i <= 3);
//
//
//        //死循环
//        while (true){
//            System.out.println("want to be better");
//        }
//    }

        //需求：系统密码是520，请用户不断的输入密码验证，验证不对输出：密码错误，验证成功输出：欢迎进入系统，并停止程序。

        int systemPassw = 520;
        while (true){
            System.out.println("请输入系统密码：");
            Scanner sc = new Scanner(System.in);
            int inputPassw = sc.nextInt();
            if (inputPassw != systemPassw){
                System.out.println("输入的密码不正确，请重新输入！");
            }
            else {
                System.out.println("密码正确，欢迎进入系统......");
                break;
            }

        }
    }


}
