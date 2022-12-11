package cc.yhscy.reload;

/**
 * @author ShiChun
 * @date 2022/12/11 11:52
 */
public class ReloadDemo2 {
    //目标：明确return关键字的使用；

    public static void main(String[] args) {
        division(3,1);

    }

    public static void division(int a, int b){
        if (b == 0){
            System.out.println("除数不能为0");
            return;
        }

        System.out.println(a/b);
    }
}
