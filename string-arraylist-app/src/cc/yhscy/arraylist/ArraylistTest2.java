package cc.yhscy.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author ShiChun
 * @date 2022/12/17 20:15
 */
public class ArraylistTest2 {
    public static void main(String[] args) {
        //后台程序需要存储如上学生信息并展示，然后要提供按照学号搜索学生信息的功能。
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("张三","001",8,"3年2班"));
        students.add(new Student("李四","002",9,"3年2班"));
        students.add(new Student("王五","001",10,"3年2班"));
        students.add(new Student("赵六","001",11,"3年2班"));

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查询的学生号码：");
        String id = sc.next();
        Student s = getStudentByid(students,id);
        if (s == null){
            System.out.println("此人不存在");

        }else {
            System.out.println(s.getId());
        }



    }

    public static Student getStudentByid(ArrayList<Student> students, String id){
        for (int i = 0; i < students.size(); i++) {
           Student s = students.get(i);
           if (s.getId().equals(id)){
               return s;
           }

        }
        return null;


    }

}
