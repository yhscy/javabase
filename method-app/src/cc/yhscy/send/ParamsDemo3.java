package cc.yhscy.send;

/**
 * @author ShiChun
 * @date 2022/12/11 9:35
 */
public class ParamsDemo3 {
    public static void main(String[] args) {
        /*
        需求：
设计一个方法用于输出任意整型数组的内容，要求输出成如下格式：
      “该数组内容为：[11, 22, 33, 44, 55]”

         */
        int[] arrayList = {11,22,33,344,44};
        printArray(arrayList);

    }

    public static void printArray(int[] arrayList){
//        System.out.println("该数组内容为:" + arrayList);   //该数组内容为:[I@74a14482
        System.out.print("该数据内容为：" );
        System.out.print("[");
        for (int i = 0; i <= arrayList.length - 1; i++){
            if (i == arrayList.length -1){    //坑：就是当i = 最后一位索引值时，不需要加“ ,”
                System.out.print(arrayList[i]);
            }
            else {
                System.out.print(arrayList[i] + ",");
            }


        }
        System.out.print("]");

    }
}
