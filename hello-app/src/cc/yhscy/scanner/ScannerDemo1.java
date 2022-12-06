package cc.yhscy.scanner;

import java.util.Scanner;

/**
 * @author ShiChun
 * @date 2022/12/6 14:00
 */
public class ScannerDemo1 {
    public static void main(String[] args) {
        //目标：掌握键盘录入技术

        //创建一个扫描器对象
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入您的年龄：");
        int age = sc.nextInt();
        System.out.println("您的年龄是：" + age + "岁");

        System.out.println("请输入您的姓名：");
        String name = sc.next();
        System.out.println("您的姓名是：" + name);



    }
}
