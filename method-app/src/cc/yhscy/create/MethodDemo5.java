package cc.yhscy.create;

/**
 * @author ShiChun
 * @date 2022/12/10 23:04
 */
public class MethodDemo5 {
    //目标：搞清楚放在在内存中的运行原理

    public static void main(String[] args) {
        doEverthing();
    }

    public static void eat(){
        System.out.println("在吃饭...");
    }

    public static void sleep(){
        System.out.println("在睡觉...");
    }

    public static void beat(){
        System.out.println("打豆豆...");
    }

    public static void doEverthing(){
        eat();
        sleep();
        beat();
        System.out.println("一天的活就此结束。。。");
    }
}
