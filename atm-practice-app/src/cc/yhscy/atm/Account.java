package cc.yhscy.atm;

/**
 * @author ShiChun
 * @date 2022/12/18 9:27
 */
public class Account {
    private String cardId;
    private String name;
    private String passWord;
    private double money;
    private double quotaMoney;

    public Account() {
    }

    public Account(String cardId, String name, String passWord, double money, double quotaMoney) {
        this.cardId = cardId;
        this.name = name;
        this.passWord = passWord;
        this.money = money;
        this.quotaMoney = quotaMoney;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getQuotaMoney() {
        return quotaMoney;
    }

    public void setQuotaMoney(double quotaMoney) {
        this.quotaMoney = quotaMoney;
    }
}
