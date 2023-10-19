package amazon;

public class Product {
    private int p_id, price;
    private String p_name;

    public Product(String p_name, int price) {
        this.p_name = p_name;
        this.price = price;
        this.p_id = (int)(Math.random()*2000000);
    }

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public String getP_name() {
        return p_name;
    }

}
