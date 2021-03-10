package _16_io_binary_file_serialization.baitap;

import java.io.Serializable;

public class Product implements Serializable {
    private String id;
    private String name;
    private String madeOf;
    private double prices;
    private String describe;

    public Product() {
    }

    public Product(String id, String name, String madeOf, double prices, String describe) {
        this.id = id;
        this.name = name;
        this.madeOf = madeOf;
        this.prices = prices;
        this.describe = describe;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMadeOf() {
        return madeOf;
    }

    public void setMadeOf(String madeOf) {
        this.madeOf = madeOf;
    }

    public double getPrices() {
        return prices;
    }

    public void setPrices(double prices) {
        this.prices = prices;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", madeOf='" + madeOf + '\'' +
                ", prices=" + prices +
                ", describe='" + describe + '\'' +
                '}';
    }
}
