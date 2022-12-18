package cc.yhscy.arraylist;

import java.util.ArrayList;

/**
 * @author ShiChun
 * @date 2022/12/17 9:48
 */
public class ArraylistDemo3 {
    //目标：掌握数组集合的常用方法
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("zhangsan");
        list.add("lisi");
        list.add("wangwu");
        list.add("wangmazi");
        list.add("lilaoer");
        System.out.println(list);

        //获取某个索引位置处的元素值
        String name = list.get(1);
        System.out.println(name);

        //获取集合的个数
        System.out.println(list.size());

        //遍历数组集合
        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));

        }

        //删除某个元素并返回
        list.remove(2);
        System.out.println(list);

        //删除某个元素
        list.remove("lilaosi");

        System.out.println(list);

        //修改指定索引的值
        list.set(1,"lisisi");
        System.out.println(list);
    }
}
