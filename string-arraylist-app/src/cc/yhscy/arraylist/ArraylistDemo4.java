package cc.yhscy.arraylist;

import com.sun.xml.internal.ws.api.client.WSPortInfo;

import java.util.ArrayList;

/**
 * @author ShiChun
 * @date 2022/12/17 19:23
 */
public class ArraylistDemo4 {
    public static void main(String[] args) {
        /*
        某个班级的考试在系统上进行，成绩大致为：98, 77, 66, 89, 79, 50, 100
        现在需要先把成绩低于80分以下的数据去掉。

         */

        ArrayList<Integer> list = new ArrayList<>();
        list.add(98);
        list.add(77);
        list.add(66);
        list.add(89);
        list.add(79);
        list.add(50);
        list.add(100);
        System.out.println(list);


        //错误解法
/*        for (int i = 0; i < list.size() ; i++) {
            if (list.get(i) < 80){
                list.remove(i);
            }
        }
        System.out.println(list);*/



        //正确解法1
/*
        for (int i = 0; i < list.size() ; i++) {
            if (list.get(i) < 80){
                list.remove(i);
                i--;  //退回到顶上来的元素位置
            }

        }
        System.out.println(list);

*/

        //正确解法2
        for (int i = list.size() - 1; i >= 0 ; i--) {
            if (list.get(i) < 80){
                list.remove(i);

        }

    }
        System.out.println(list);

}}
