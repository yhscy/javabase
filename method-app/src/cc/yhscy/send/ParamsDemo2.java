package cc.yhscy.send;

/**
 * @author ShiChun
 * @date 2022/12/10 23:20
 */
public class ParamsDemo2 {
    public static void main(String[] args) {
        int[] arrs = new int[]{19,20,30};
        change(arrs);
        System.out.println(arrs[1]);//引用值没变，所以当前数组的数据变了之后。


    }

    public static void change(int[] arrs){
        System.out.println("change方法内部" + arrs[1]); //20
        arrs[1] = 222;
        System.out.println("change方法内部" + arrs[1]); //222

    }
}
