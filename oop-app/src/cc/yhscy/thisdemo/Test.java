package cc.yhscy.thisdemo;

/**
 * @author ShiChun
 * @date 2022/12/13 17:45
 */
public class Test {
    public static void main(String[] args) {
        Car c = new Car("宝马",80);
        System.out.println(c.name);
        System.out.println(c.price);

        c.goWith("奔驰");
    }

}
