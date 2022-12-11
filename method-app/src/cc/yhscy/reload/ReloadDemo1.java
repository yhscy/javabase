package cc.yhscy.reload;

/**
 * @author ShiChun
 * @date 2022/12/11 11:32
 */
public class ReloadDemo1 {
    public static void main(String[] args) {
        //目标：理解方法重载的意义。
    }

    public static void fire(){
        System.out.println("向米国发射一枚导弹！");
    }

    public static void fire(String area){
        System.out.println("向area发射一枚导弹！".replace("area",area));
    }


    public static void fire(String area, int number){
        System.out.println("向area发射一枚导弹！".replace("area",area));
        System.out.println("默认发射" + number + "颗");
    }

}
