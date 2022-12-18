package cc.yhscy.arraylist;

import java.util.ArrayList;

/**
 * @author ShiChun
 * @date 2022/12/17 8:47
 */
public class ArraylistDemo1 {
    public static void main(String[] args) {
        ArrayList aList = new ArrayList();
        aList.add("稳重");
        aList.add(1);
        aList.add(true);
        aList.add(55.3);
        aList.add('1');
        aList.add(55.55);
        System.out.println(aList);
    }
}
