package cc.yhscy.arraylist;

import java.util.ArrayList;

/**
 * @author ShiChun
 * @date 2022/12/17 9:00
 */
public class ArraylistDemo2 {
    public static void main(String[] args) {
        // 目标：掌握数组集合的泛型使用

//        ArrayList<String> list = new ArrayList<String>();  JDK1.7之后，泛型后面的类型申明可以不写
        ArrayList<String> list = new ArrayList<>();
        list.add("zhangsan");
        list.add("lisi");
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        System.out.println(list2);


    }
}
