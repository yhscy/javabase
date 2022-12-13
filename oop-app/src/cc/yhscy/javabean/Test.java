package cc.yhscy.javabean;

/**
 * @author ShiChun
 * @date 2022/12/13 18:06
 */
public class Test {
    public static void main(String[] args) {
        User u = new User("shichun","石家庄","本科",1.20);

        System.out.println(u.getName());
        u.setName("zhangsan");
        System.out.println(u.getName());
    }
}
