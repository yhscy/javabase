package cc.yhscy.createobject;

/**
 * @author ShiChun
 * @date 2022/12/12 9:36
 */
public class Test {
    public static void main(String[] args) {
        Car c = new Car();

        c.name = "雷克萨斯";
        c.price = 29.99;

        System.out.println(c.name);
        System.out.println(c.price);

        c.start();
        c.run();

        Car c2= new Car();
        c2.name = "坦克300";
        c2.price = 19.99;

        System.out.println(c2.name);
        System.out.println(c2.price);

        c2.start();
        c2.run();

    }
}
