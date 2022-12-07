package cc.yhscy.create;

/**
 * @author ShiChun
 * @date 2022/12/7 23:52
 */
public class ArrayDemo3 {
    //掌握java内存分配原理
    public static void main(String[] args) {     //--------->加载到栈内存
        int number = 1;                    //---------->加载打栈内存，开辟一块空间,名字叫number ,存储变量值1
        System.out.println(number);


        int[] box = {33,44,55};             //---------->加载到占内存，开辟一块空间，名字叫box,存储的是数组引用,{33,44,55}在堆内存中开辟了一块空间存储具体的值
        System.out.println(box);


        box[0] = 333;
        box[1] = 335;
        box[2] = 336;

        System.out.println(box[0]);
        System.out.println(box[1]);
        System.out.println(box[2]);
    }

}
