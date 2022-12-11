package cc.yhscy.send;

/**
 * @author ShiChun
 * @date 2022/12/11 9:56
 */
public class ParmasDemo4{
    public static void main(String[] args) {
        /*
        需求：设计一个方法可以接收整型数组，和要查询的元素值；最终要返回元素在该数组中的索引，如果数组中不存在该元素则返回 -1。

         */
        int[] arrayList = {1,2,33,3,34444};

        System.out.println(queryArray(arrayList, 33));


    }

    public static int queryArray(int[] arrayList, int element){
//        int num = 0;
//        for (int i = 0; i <= arrayList.length - 1; i++){
//            if (arrayList[i] == element){
//                num = arrayList[i];
//                break;
//            }else {
//                num = -1;
//            }
//        }
//        return num; //return 定义在for 循环外才生效；
//    }

        for (int i = 0; i <= arrayList.length -1; i++){
            if (arrayList[i] == element){
                System.out.println("当前索引值是" + i);
                return i;
            }
        }
        return -1;
    }
}
