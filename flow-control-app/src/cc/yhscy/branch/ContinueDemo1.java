package cc.yhscy.branch;

/**
 * @author ShiChun
 * @date 2022/12/6 23:30
 */
public class ContinueDemo1 {
    //目标：区分break & continue

    public static void main(String[] args) {
        for(int i = 0; i <= 5; i++){

            if (i == 3){
                break;
            }
            System.out.println("当前是循环" + i + "次");
        }

        System.out.println("----------------------------------");
        for(int ii = 0; ii <= 5; ii++){

            if (ii == 3){   //不执行该条件
                continue;
            }
            System.out.println("当前是循环" + ii + "次");
        }

    }
}
