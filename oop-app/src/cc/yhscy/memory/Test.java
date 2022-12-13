package cc.yhscy.memory;

/**
 * @author ShiChun
 * @date 2022/12/12 12:04
 */
public class Test {
    public static void main(String[] args) {
        Student s = new Student();

        s.name = "shichun";
        s.age = 10;
        s.hobby = "篮球";

        s.play();
        s.study();
        System.out.println(s);


//        Student s1 = s;
//        System.out.println(s1);

        Student s1 = null;  //引用地址为空
        s1.play();
        s1.study();

    }
}
