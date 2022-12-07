package cc.yhscy.create;

/**
 * @author ShiChun
 * @date 2022/12/7 23:17
 */
public class ArrayDemo2 {
    //目标：数组求最大值
    public static void main(String[] args) {
        int[] score = {15,1000,10000,20000,-5};
        int tmp = score[0];
        for (int i = 1; i <= score.length -1; i++){
            if (score[i] > tmp){
                tmp = score[i];
            }


        }
        System.out.println("max:" + tmp);

    }
}
