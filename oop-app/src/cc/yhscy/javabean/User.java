package cc.yhscy.javabean;

/**
 * @author ShiChun
 * @date 2022/12/13 18:06
 */
public class User {
    private String name;
    private String workPlace;
    private String background;
    private double money;

    public User() {
    }

    public User(String name, String workPlace, String background, double money) {
        this.name = name;
        this.workPlace = workPlace;
        this.background = background;
        this.money = money;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
