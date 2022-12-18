package cc.yhscy.string;

/**
 * @author ShiChun
 * @date 2022/12/16 10:45
 */
public class StringDemo1 {
    public static void main(String[] args) {

        String name = "sc";
        System.out.println(name);

        String name1 = new String();  //创建了空白的字符串对象；
        System.out.println(name1);

        String name2 = new String("lisi");  //根据传入的字符创建对象；
        System.out.println(name2);


        char[] a = {'a','b'};
        String name3 = new String(a);    //根据字符数组的内容，创建字符串对象;
        System.out.println(name3);

        byte[] b = {98,99,97};
        String name4 = new String(b);
        System.out.println(name4);       //根据字符数组的内容，来创建字符串对象；


    }
}
