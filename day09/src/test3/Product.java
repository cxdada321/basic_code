package test3;

public class Product {
    private String name;
    private int price;
    private int count;
    private int title;

    public Product() {
    }
    public Product(String name, int price, int count, int title) {
        this.name = name;
        this.price = price;
        this.count = count;
        this.title = title;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
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

    /**
     * 获取
     * @return count
     */
    public int getCount() {
        return count;
    }

    /**
     * 设置
     * @param count
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * 获取
     * @return title
     */
    public int getTitle() {
        return title;
    }

    /**
     * 设置
     * @param title
     */
    public void setTitle(int title) {
        this.title = title;
    }

}
