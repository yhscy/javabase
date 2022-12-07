package cc.yhscy.create;

/**
 * @author ShiChun
 * @date 2022/12/8 0:27
 */
public class ArrayDemo4 {
    public static void main(String[] args) {
        //目标：掌握冒泡排序的原理及使用
        int[] list = {5,1,3,2};

        //第一步：确定该数组要执行的轮数，4个元素，执行3轮，list.length - 1;
        for (int i = 1; i <= list.length -1; i++){
            // 第二步：比较执行的轮数 list.length - i
            for (int j = 0;j < list.length - i; j++){
                if (list[j] > list[j + 1]){  // 4 1
                    int tmp = list[j + 1]; //1
                    list[j+1] = list[j];  //4
                    list[j] = tmp;
                }
            }

        }

        for (int k = 0; k <= list.length - 1; k++){
            System.out.print(list[k]);
        }


    }
}
