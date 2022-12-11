package cc.yhscy.send;

import java.io.LineNumberReader;

/**
 * @author ShiChun
 * @date 2022/12/11 10:26
 */
public class ParamsDemo5 {
    public static void main(String[] args) {
        /*
        如果两个数组的类型，元素个数，元素顺序和内容是一样的我们就认为这2个数组是一模一样的。
         */

        int[] arrs1 = {10, 20, 33};
        int[] arrs2 = {10, 20, 30};
        System.out.println(compare(arrs1,arrs2));
    }

    public static boolean compare(int[] arrayList1,int[] arrayList2){
        if (arrayList1.length == arrayList2.length){
            for (int i = 0; i <= arrayList1.length - 1; i++){
                if (arrayList1[i] != arrayList2[i]){
                    return false;
                }
            }
            return true;
        }else{
            return false;
        }
    }


















}

