package cc.yhscy.string;

/**
 * @author ShiChun
 * @date 2022/12/16 14:46
 */
public class StringOperate {
    public static void main(String[] args) {
//        public int length​()
        String name = "shichun";
        System.out.println(name.length());

//        public char charAt​(int index)
        String name1 = "zhangsan";
        System.out.println(name1.charAt(0));

//        public char[] toCharArray​()：
        String name3 = "wangwu";
        char[] array = name3.toCharArray();
        for (int i = 0; i <= array.length - 1;i++){
            System.out.println(array[i]);
        }

//        public String substring(int beginIndex, int endIndex)
        String name4 = "wangmazi";
        System.out.println(name4.substring(0, 3));  //左闭右开
        System.out.println(name4.substring(1));

        String name5 = "lurenjia";
        System.out.println(name5.contains("a"));

//        public String replace(CharSequence target, CharSequence replacement)
        System.out.println(name5.replace("jia","yi"));
        System.out.println(name5.startsWith("l1"));

//        public String[] split(String regex)
        String namePlayer = "勒布朗，科比，麦迪";
        String[] names = namePlayer.split("，");
        System.out.println(names);
        for (int i = 0; i <= names.length - 1; i++){
            System.out.println(names[i]);
        }

    }
}
