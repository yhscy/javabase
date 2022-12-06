package cc.yhscy.branch;

/**
 * @author ShiChun
 * @date 2022/12/6 9:43
 */
public class IfDemo1 {
    //目标：掌握if分支解决问题。
    public static void main(String[] args) {
        //需求：心跳（68-80）之间正常，否则系统提示进一步检查
        int hart = 50;
//        if (hart > 68) {
//            System.out.println("心跳正常");
//
//        }else if (hart < 80) {
//            System.out.println("心跳正常");
//        }
//        else {
//            System.out.println("该注意身体了，及时去进一步检查！");
//        }

        if (hart < 60 || hart >80 ){
            System.out.println("请及时做下一步检查，您的心跳是" + hart );
        }else{
            System.out.println("身体状况良好");
        }

        // 绩效评级: A: 80-100 B 60-80 C:60以下
        int score = 66;
        if (score >= 80 || score <= 100) {
            System.out.println("您当前的绩效是A");
        }else if(score >= 60 || score < 80){
            System.out.println("您当前的绩效是B");
        }else if (score < 60){
            System.out.println("您的当前的绩效是C,还需继续努力!");
        }else {
            System.out.println("您输入的分数有毛病");
        }

    }
}
