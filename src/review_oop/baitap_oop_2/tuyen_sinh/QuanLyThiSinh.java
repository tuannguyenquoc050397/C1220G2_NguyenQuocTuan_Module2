package review_oop.baitap_oop_2.tuyen_sinh;

import java.util.*;

public class QuanLyThiSinh {
    public static List<ThiSinh> listThiSinh=new ArrayList<>();
    public static Set<String> listSoBaoDanh=new HashSet<>();
    public void themMoiThiSinh(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap ten");
        String ten=scanner.nextLine();
        System.out.println("Nhap So bao danh");
        boolean check=true;
        String soBaoDanh;
        do {
            soBaoDanh=scanner.nextLine();
            if(QuanLyThiSinh.listSoBaoDanh.contains(soBaoDanh)){
                System.out.println("so bao danh da ton tai" +
                        "\n moi nhap lai");
                check=true;
            }else {
                QuanLyThiSinh.listSoBaoDanh.add(soBaoDanh);
                check=false;
            }
        }while (check);
        System.out.println("Nhap dia chi");
        String diaChi=scanner.nextLine();
        System.out.println("Nhap uu tien");
        String uuTien=scanner.nextLine();
        System.out.println("Ban co muon them KHOI THI cho thi sinh?" +
                "\n1. khoi A" +
                "\n2. khoi B" +
                "\n3. khoi C" +
                "\n4. tro ve menu" +
                "\n5. thoat");
        String chonKhoi=scanner.nextLine();

        switch (chonKhoi){
            case "1":
                new ThiSinhKhoiA(soBaoDanh,ten,diaChi,uuTien);
                hienThiMenu();
                break;
            case "2":
                new ThiSinhKhoiB(soBaoDanh,ten,diaChi,uuTien);
                hienThiMenu();
                break;
            case "3":
                new ThiSinhKhoiC(soBaoDanh,ten,diaChi,uuTien);
                hienThiMenu();
                break;
            case "4":
                new ThiSinh(soBaoDanh, ten, diaChi, uuTien);
                hienThiMenu();
                break;
            case "5":
                new ThiSinh(soBaoDanh, ten, diaChi, uuTien);
                break;
            default:
        }
    }
    public void hienThiDanhSach(){
        Scanner scanner=new Scanner(System.in);
        for(ThiSinh thiSinh:listThiSinh){
            System.out.println(thiSinh);
        }
        System.out.println("1. de quay lai menu" +
                "\n 2. thoat");
        String a=scanner.nextLine();
        switch (a){
            case "1":
                hienThiMenu();
                break;
            default:
        }
    }
    public void timKiem(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("hay nhap so bao danh");
        String soBaoDanh=scanner.nextLine();
        if(listSoBaoDanh.contains(soBaoDanh)){
            for (ThiSinh thiSinh : listThiSinh) {
                if (thiSinh.getSoBaoDanh().equals(soBaoDanh)) {
                    System.out.println(thiSinh);
                }
            }
        }else {
            System.out.println("so bao danh ko ton tai");
        }
    }
    public void hienThiMenu(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("1. Them moi thi sinh" +
                "\n2. Danh sach thi sinh" +
                "\n3. Tim kiem theo so bao danh" +
                "\n4. Thoat");
        String hienThi=scanner.nextLine();
        switch (hienThi){
            case "1":
                themMoiThiSinh();
                break;
            case "2":
                hienThiDanhSach();
                break;
            case "3":
                timKiem();
                break;
            case "4":
                break;
            default:
        }
    }

    public static void main(String[] args) {
        ThiSinh ts1= new ThiSinh("1","A","DN", "0.5");
        ThiSinhKhoiA ts2= new ThiSinhKhoiA("2","B","DN", "0.5");
        ThiSinhKhoiC ts3=new ThiSinhKhoiC("3","C","DN", "0.5");
        QuanLyThiSinh quanLy=new QuanLyThiSinh();
        quanLy.hienThiMenu();
    }
}
