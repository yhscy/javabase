package cc.yhscy.constructor;

/**
 * @author ShiChun
 * @date 2022/12/13 8:57
 */
public class Car {
    String name;
    double price;

    public Car(){
        System.out.println("无参构造器被调用执行");
    }

    public Car(String n,double p){
        System.out.println("有参构造器被调用执行");
        name = n;
        price = p;

    }
}
