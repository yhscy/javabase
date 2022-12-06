package cc.yhscy.branch;

/**
 * @author ShiChun
 * @date 2022/12/6 14:10
 */
public class SwitchDemo1 {
    //掌握switch分支的使用
    public static void main(String[] args) {
        String week = "星期三";

        switch (week){
            case "星期一":
                System.out.println("今晚去健身！");
                break;
            case "星期二":
                System.out.println("今晚去吃鸡！");
                break;
            case "星期三":
                System.out.println("今晚打英雄联盟！");
                break;
            case "星期四":
                System.out.println("今晚去逛街！");
                break;
            case "星期五":
                System.out.println("今晚去约妹子！");
                break;
            case "星期六":
                System.out.println("今晚陪家人吃饭！");
                break;
            case "星期日":
                System.out.println("今晚啥也不想干！");
                break;

        }
    }
}
