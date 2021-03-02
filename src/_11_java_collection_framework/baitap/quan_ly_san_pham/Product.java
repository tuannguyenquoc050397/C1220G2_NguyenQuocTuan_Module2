package _11_java_collection_framework.baitap.quan_ly_san_pham;

public class Product {
    private int id;
    private String nameOfProduct;
    private int productCost;

    public Product(int id, String nameOfProduct, int productCost) {
        this.id = id;
        this.nameOfProduct = nameOfProduct;
        this.productCost = productCost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public int getProductCost() {
        return productCost;
    }

    public void setProductCost(int productCost) {
        this.productCost = productCost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nameOfProduct='" + nameOfProduct + '\'' +
                ", productCost=" + productCost +
                '}';
    }
}
