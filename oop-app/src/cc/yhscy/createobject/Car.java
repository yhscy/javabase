package cc.yhscy.createobject;

/**
 * @author ShiChun
 * @date 2022/12/12 9:33
 */
public class Car {
    String name;   //成员变量  =  属性
    double price;

    public void start(){       //成员方法
        System.out.println(name + "的价格" + price + "正在启动" );
    }

    public void run(){
        System.out.println(name + "的价格" + price + "跑得很快" );
    }
}
