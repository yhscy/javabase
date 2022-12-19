package cc.yhscy.atm;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author ShiChun
 * @date 2022/12/18 9:27
 */
public class ATMSystem {
    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("=======欢迎来到黑马ATM系统======");
            
            System.out.println("请输入您要选择的功能：1.登录 2.开户");
            int command = sc.nextInt();
            switch (command){
                case 1:
                    System.out.println("准备调用登录方法");
                    login(accounts,sc);
                    break;
                case 2:
                    System.out.println("准备调用开户方法");
                    register(accounts,sc);
                    break;
                default:
                    System.out.println("输入的内容有误，请重新输入");

            }
        }

    }

    private static void login(ArrayList<Account> accounts,Scanner sc) {
        System.out.println("=======系统用户登录操作=======");
        if (accounts.size() == 0){
            System.out.println("当前账号系统无账户，请做开户操作");
            return;
        }

        while (true) {
            System.out.println("请输入登录卡号");
            String cardId = sc.next();
            Account cc = getAccountByCcardid(accounts,cardId);
            if (cc != null){
                //卡号存在
                while (true) {
                    System.out.println("请输入登录密码：");
                    String password = sc.next();
                    if (cc.getPassWord().equals(password)){
                        System.out.println("登录成功!"+ cc.getName()+"进入系统了！" );
                        //其他操作
                        showUserCommand(sc,cc);
                        return;

                    }
                    else {
                        System.out.println("输入密码有误");
                    }
                }

            }else {
                System.out.println("对不起，系统中不存在该账户卡号");
            }
        }

    }

    /**
     * 展示登录成功操作页
     */
    private static void showUserCommand(Scanner sc,Account acc) {
        while (true) {
            System.out.println("======操作页=======");
            System.out.println("1.查询账户");
            System.out.println("2.存款");
            System.out.println("3.取款");
            System.out.println("4.转账");
            System.out.println("5.修改密码");
            System.out.println("6.退出");
            System.out.println("7.注销账户");
            System.out.println("请选择你要的操作：");
            int command = sc.nextInt();
            switch (command){
                case 1:
                    //查询账户
                    showAccount(acc);
                    break;
                case 2:
                    //存款
                    saveMoney(sc,acc);
                    break;
                case 3:
                    //取款
                    drawMoney();
                    break;
                case 4:
                    //转账
                case 5:
                    //修改密码
                    break;
                case 6:
                    //退出账号
                    System.out.println("退出成功，欢迎下次光临");
                    return;
                case 7:
                    //注销账户
                    break;
                default:
                    System.out.println("您输入的指令不正确，重新输入");
            }
        }

    }


    /**
     * 取钱操作
     * @param sc
     * @param acc
     */
    private static void drawMoney(Scanner sc, Account acc) {
        System.out.println("======用户取钱操作======");
        if(acc.getMoney() < 100){
            System.out.println("您的账户中的金额不足100元，不能取钱");
            return;
        }
        System.out.println("请输入您要取的金额");
        double money = sc.nextDouble();
        if (money > acc.getMoney()){
            System.out.println("您的超过了限额，限额为" + acc.getQuotaMoney());
        }else {
            if (money > acc.getMoney()){
                System.out.println("余额不足，您的账户总余额为" + acc.getMoney());
            }else{
                System.out.println("恭喜您，取钱" + money + "元，成功");
                acc.setMoney(acc.getMoney() - money);
                showAccount(acc);
                return;
            }

        }

    }

    private static void saveMoney(Scanner sc,Account acc) {
        System.out.println("=====用户存钱操作=====");
        System.out.println("请输入要存入的金额：");
        double monney = sc.nextDouble();
        acc.setMoney(acc.getMoney() + monney);
        showAccount(acc);

    }

    private static void showAccount(Account acc) {
        System.out.println(acc.getCardId());
        System.out.println(acc.getName());
        System.out.println(acc.getMoney());
        System.out.println(acc.getQuotaMoney());

    }

    private static void register(ArrayList<Account> accounts,Scanner sc) {
        System.out.println("======系统开户操作========");
        Account account = new Account();
        System.out.println("请输入账户用户名");
        String name = sc.next();
        account.setName(name);

        while (true) {
            System.out.println("请输入密码");
            String password = sc.next();
            System.out.println("请再次输入密码");
            String okpassword = sc.next();
            if (password.equals(okpassword)){
                account.setPassWord(okpassword);
                break;
            }else {
                System.out.println("两次密码不一致，请重新输入");
            }
        }
        System.out.println("请输入账户当次限额");
        double money = sc.nextDouble();
        account.setQuotaMoney(money);

        String cardId = getRandomCardId(accounts);
        account.setCardId(cardId);

        accounts.add(account);
        System.out.println("开户成功" + name + "您的账号是" + cardId);




    }

    /**
     *
     * @return
     */
    private static String getRandomCardId(ArrayList<Account> accounts) {
        Random r= new Random();
        while (true) {
            String cardId = "";
            for (int i = 0; i < 8 ; i++) {
                cardId += r.nextInt(8);
            }
            //判断这个卡号是否重复
            Account acc = getAccountByCcardid(accounts,cardId);
            if (acc == null){
                return cardId;
            }
        }

    }

    public static Account getAccountByCcardid(ArrayList<Account> accounts,String cardId){
        for (int i = 0; i < accounts.size() ; i++) {
            if (accounts.get(i).getCardId().equals(cardId)) {
                return accounts.get(i);

            }

        }
        return null;
    }

}
