package cc.yhscy.string;

import java.util.Scanner;

/**
 * @author ShiChun
 * @date 2022/12/16 14:06
 */
public class StringDemo4 {
    //目标：字符串的内容比较

    public static void main(String[] args) {
        String okName = "ShiChun";
        String okPassword = "123456";

        System.out.println("请输入账号：");
        Scanner sc = new Scanner(System.in);
        String inputName = sc.next();
        System.out.println("请输入密码：");
        String inputPassword = sc.next();

//        if (okName.equals(inputName) && okPassword.equals(inputPassword)){
        if (okName.equalsIgnoreCase(inputName) && okPassword.equalsIgnoreCase(inputPassword)){
            System.out.println("success");
        }else {
            System.out.println("fail");
        }



    }

}
