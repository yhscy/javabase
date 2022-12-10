package cc.yhscy.create;

import java.lang.reflect.Array;

/**
 * @author ShiChun
 * @date 2022/12/10 17:29
 */
public class MethodDemo4 {
    public static void main(String[] args) {
        //找出数组最大值
        int[] intList = {-5,100,29,300,1000};

        System.out.println(findmax(intList));

    }

    public static int findmax(int[] list){
        int max = list[0];
        for (int i = 0; i <= list.length - 1;i++){
            if (list[i] > max){
                max = list[i];
            }

            }


        return max;

        }


    }
