package cc.yhscy.create;

import org.jetbrains.annotations.NotNull;

/**
 * @author ShiChun
 * @date 2022/12/10 16:51
 */
public class MethodAttention {
    public static void main(String[] args) {
        System.out.println("=====方法使用的注意事项=====");
        String myName = add("Shi","Chun");
        System.out.println(myName);


    }

    public static void print(){
        System.out.println("定义的是一个无惨无返回值类型的函数");
    }

    public static @NotNull
    String add(String sure, String name){
        System.out.println("这是返回字符串类型的方法");

        return sure + name;


    }

}
