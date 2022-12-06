package cc.yhscy.hello;

/**
 * @author ShiChun
 * @date 2022/12/3 17:31
 */
public class MultiTable {
    //九九乘法表，引入\t制表符
    public static void main(String[] args) {
        for (int i = 1;i <= 9;i++){
            for (int j = 1; j <= i;j++){
                System.out.print(i + "*" + j + "=" + i * j + "\t");
            } //一个循环结束，j被赋予的变量值又被重新释放
            System.out.println();
        }
    }
}

