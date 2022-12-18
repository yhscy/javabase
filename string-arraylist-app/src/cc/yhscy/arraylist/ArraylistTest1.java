package cc.yhscy.arraylist;

import java.util.ArrayList;

/**
 * @author ShiChun
 * @date 2022/12/17 19:45
 */
public class ArraylistTest1 {
    public static void main(String[] args) {
        //影院系统需要在后台存储上述三部电影，然后依次展示出来。

        ArrayList<Movie> movies = new ArrayList();    //自定义的引用类型

        movies.add(new Movie("肖申克的救赎",9.7,"罗宾斯"));
        movies.add(new Movie("霸王别姬",9.0,"张国荣"));
        movies.add(new Movie("阿甘正传",8.7,"汤姆"));
        System.out.println(movies);


        for (int i = 0; i < movies.size(); i++) {
            System.out.println(movies.get(i).getName());
            System.out.println(movies.get(i).getScore());
            System.out.println(movies.get(i).getActor());

        }


    }
}
