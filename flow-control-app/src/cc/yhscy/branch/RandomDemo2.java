package cc.yhscy.branch;

import java.util.Random;

/**
 * @author ShiChun
 * @date 2022/12/6 23:57
 */
public class RandomDemo2 {
    //Random随机数如何生成 65 – 91之间的随机数？
    public static void main(String[] args) {
        Random rm = new Random();
        int randomData = rm.nextInt(27) + 65; //0-26
        System.out.println(randomData);
    }
}
