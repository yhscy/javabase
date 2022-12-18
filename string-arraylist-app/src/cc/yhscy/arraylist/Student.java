package cc.yhscy.arraylist;

/**
 * @author ShiChun
 * @date 2022/12/17 20:10
 */
public class Student {
    private String name;
    private String id;
    private int age;
    private String classNum;

    public Student() {
    }

    public Student(String name, String id, int age, String classNum) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.classNum = classNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassNum() {
        return classNum;
    }

    public void setClassNum(String classNum) {
        this.classNum = classNum;
    }
}
