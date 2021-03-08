package _11_java_collection_framework.baitap.quan_ly_san_pham;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductManagerArrayList {
    private List<Product> listProduct=new ArrayList<>();
    public void add(Product product){
        listProduct.add(product);
    }
    public boolean delete(int id){
        for(int i=0; i<listProduct.size(); i++){
            if(listProduct.get(i).getId()==id){
                return true;
            }
        }
        return false;
    }
    public boolean edit(int id, Product product){
        for(int i=0; i<listProduct.size(); i++){
            if(listProduct.get(i).getId()==id){
                listProduct.get(i).setId(product.getId());
                listProduct.get(i).setNameOfProduct(product.getNameOfProduct());
                listProduct.get(i).setProductCost(product.getProductCost());
                return true;
            }
        }
        return false;
    }
    public boolean search(String nameProduct){
        for(int i=0; i<listProduct.size(); i++){
            if(listProduct.get(i).getNameOfProduct()==nameProduct){
                System.out.println(listProduct.get(i));
                return true;
            }
        }
        System.out.println("ko co san pham nay: "+ nameProduct);
        return false;

    }
    public void sapXep(){
        Collections.sort(listProduct,new SortCostProduct());
    }
    public void disPlay(){
        for (Product product:listProduct){
            System.out.println(product);
        }
    }

    public static void main(String[] args) {
        ProductManagerArrayList list=new ProductManagerArrayList();
        list.add(new Product(1,"ten1",5));
        list.add(new Product(2,"ten2",12));
        list.add(new Product(3,"ten3",3));
        list.add(new Product(4,"ten4",14));
        list.add(new Product(5,"ten5",9));
        list.disPlay();
//        System.out.println("----Xoa----");
//        list.delete(4);
//        list.disPlay();
//        Product product=new Product(10,"ten10",20);
//        list.edit(3,product);
//        System.out.println("-----");
//        list.disPlay();
        System.out.println("---search---");
        list.search("ten4");
        System.out.println("-----sap xep------");
        list.sapXep();
        list.disPlay();
    }
}
