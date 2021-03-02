package _11_java_collection_framework.baitap.quan_ly_san_pham;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ProductManagerLinkedList {
    private List<Product> listProduct=new LinkedList<>();
    public void add(Product product){
        listProduct.add(product);
    }
    public Product delete(int id){
        for(int i=0; i<listProduct.size(); i++){
            if(listProduct.get(i).getId()==id){
                return listProduct.remove(i);
            }
        }
        return null;
    }
    public Product edit(int id, Product product){
        for(int i=0; i<listProduct.size(); i++){
            if(listProduct.get(i).getId()==id){
                listProduct.get(i).setId(product.getId());
                listProduct.get(i).setNameOfProduct(product.getNameOfProduct());
                listProduct.get(i).setProductCost(product.getProductCost());
                return listProduct.get(i);
            }
        }
        return null;
    }
    public Product search(String nameProduct){
        for(int i=0; i<listProduct.size(); i++){
            if(listProduct.get(i).getNameOfProduct()==nameProduct){
                return listProduct.get(i);
            }
        }
        return null;
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
        ProductManagerLinkedList list=new ProductManagerLinkedList();
        list.add(new Product(1,"ten1",5));
        list.add(new Product(2,"ten2",12));
        list.add(new Product(3,"ten3",3));
        list.add(new Product(4,"ten4",14));
        list.add(new Product(5,"ten5",9));
        list.disPlay();
    }
}
