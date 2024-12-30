package test4;

public class Car {
    private String logo;
    private String color;
    private int price;
    public Car() {
    }


    public Car(String logo, String color, int price) {
        this.logo = logo;
        this.color = color;
        this.price = price;
    }

    /**
     * 获取
     * @return logo
     */
    public String getLogo() {
        return logo;
    }

    /**
     * 设置
     * @param logo
     */
    public void setLogo(String logo) {
        this.logo = logo;
    }

    /**
     * 获取
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 获取
     * @return price
     */
    public int getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(int price) {
        this.price = price;
    }

    public String toString() {
        return "Car{logo = " + logo + ", color = " + color + ", price = " + price + "}";
    }
}
