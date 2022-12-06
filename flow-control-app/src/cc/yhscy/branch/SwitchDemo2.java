package cc.yhscy.branch;

/**
 * @author ShiChun
 * @date 2022/12/6 14:27
 */
public class SwitchDemo2 {
    public static void main(String[] args) {
        //目标：合理使用switch分支穿透，简化代码量
        int month = 7;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(month + "月份是31天");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(month + "月份是30天");
                break;
            case 2:
                System.out.println(month + "月闰年为29天，非闰年30天");
                break;
            default:
                System.out.println("数据有误！");
        }
    }
}
