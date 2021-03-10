package _16_io_binary_file_serialization.baitap;

import _16_io_binary_file_serialization.thuchanh.BinaryFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerProduct {
    private static final String pathFile = "D:\\C1220G2_NguyenQuocTuan_Module2\\src\\_16_io_binary_file_serialization\\baitap\\List.txt";

    public static void main(String[] args) {
        ManagerProduct managerProduct=new ManagerProduct();
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. them san pham" +
                "\n2. hien thi danh sach san pham" +
                "\n3. tim kiem thong tin san pham" +
                "\n4. thoat");
        String choice=scanner.nextLine();
        switch (choice){
            case "1":
                managerProduct.addProduct();
                break;
            case "2":
                managerProduct.showListProduct();
                break;
            case "3":
                managerProduct.searchProduct();
                break;
            default:
        }

    }
    public void addProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap id san pham");
        String id = scanner.nextLine();
        System.out.println("nhap ten san pham");
        String name = scanner.nextLine();
        System.out.println("nhap xuat su san pham");
        String madeOf = scanner.nextLine();
        System.out.println("them cac mo ta khac");
        String describe = scanner.nextLine();
        System.out.println("nhap gia san pham");
        String prices = scanner.nextLine();
        List list = new ArrayList<>();
        list.addAll(BinaryFile.readByteFile(pathFile));
        //   BinaryFile.clearByteFile(pathFile);
        list.add(new Product(id, name, madeOf, Double.parseDouble(prices), describe));
        BinaryFile.writeByteFile(pathFile, list);
        System.out.println("them thanh cong");
    }

    public void showListProduct() {
        for (Object s : BinaryFile.readByteFile(pathFile)) {
            System.out.println(s.toString());
        }
    }
    public void searchProduct(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap ten san pham");
        String nameProduct=scanner.nextLine();
        for (Object s:BinaryFile.readByteFile(pathFile)){
            Product product=(Product) s;
            if (product.getName().equals(nameProduct)){
                System.out.println(product.toString());
            }
        }
    }
}
