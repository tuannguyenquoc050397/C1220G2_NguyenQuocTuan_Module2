package review_oop.baitap_oop_2.tuyen_sinh;

import java.util.*;

public class ThiSinh {
    private long soBaoDanh;
    private String tenThiSinh;
    private String diaChi;
    private double uuTien;
    private static List<ThiSinh> listThiSinh=new ArrayList<>();
    private static Set<Long> listSoBaoDanh=new HashSet<>();

    public ThiSinh() {
    }

    public ThiSinh(long soBaoDanh, String tenThiSinh, String diaChi, double uuTien) {
        this.soBaoDanh = soBaoDanh;
        this.tenThiSinh = tenThiSinh;
        this.diaChi = diaChi;
        this.uuTien = uuTien;
    }

    public long getSoBaoDanh() {
        return soBaoDanh;
    }

    public void setSoBaoDanh(long soBaoDanh) {
        this.soBaoDanh = soBaoDanh;
    }

    public String getTenThiSinh() {
        return tenThiSinh;
    }

    public void setTenThiSinh(String tenThiSinh) {
        this.tenThiSinh = tenThiSinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getUuTien() {
        return uuTien;
    }

    public void setUuTien(double uuTien) {
        this.uuTien = uuTien;
    }
    public void hienThi(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("1. Them moi thi sinh" +
                "\n2. Danh sach thi sinh" +
                "\n3. Tim kiem theo so bao danh" +
                "\n4. Thoat");
        byte hienThi=scanner.nextByte();
        switch (hienThi){
            case 1:
                themMoiThiSinh();
                break;
        }
    }
    public void themMoiThiSinh(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap ten");
        String ten=scanner.nextLine();
        System.out.println("Nhap So bao danh");
        boolean check=true;
        long soBaoDanh;
        do {
             soBaoDanh=scanner.nextLong();
            if(listSoBaoDanh.contains(soBaoDanh)){
                System.out.println("so bao danh da ton tai" +
                        "\n moi nhap lai");
                check=true;
            }else {
               listSoBaoDanh.add(soBaoDanh);
               check=false;
            }
        }while (check);
        System.out.println("Nhap dia chi");
        String diaChi=scanner.nextLine();
        System.out.println("Nhap uu tien");
        double uuTien=scanner.nextDouble();
        System.out.println("Ban co muon them KHOI THI cho thi sinh?" +
                "\n1. khoi A" +
                "\n2. khoi B" +
                "\n3. khoi C" +
                "\n4. tro ve menu" +
                "\n5. thoat");
        byte chonKhoi=scanner.nextByte();
        ThiSinh thiSinh;
        switch (chonKhoi){
            case 1:
                thiSinh=new ThiSinhKhoiA(soBaoDanh,ten,diaChi,uuTien);
                listThiSinh.add(thiSinh);
                break;
            case 2:
                thiSinh=new ThiSinhKhoiB(soBaoDanh,ten,diaChi,uuTien);
                listThiSinh.add(thiSinh);
                break;
            case 3:
                thiSinh=new ThiSinhKhoiC(soBaoDanh,ten,diaChi,uuTien);
                listThiSinh.add(thiSinh);
                break;
            case 4:
                listThiSinh.add(new ThiSinh(soBaoDanh, ten, diaChi, uuTien));
                hienThi();
                break;
            case 5:
                listThiSinh.add(new ThiSinh(soBaoDanh, ten, diaChi, uuTien));
                break;
            default:
        }
    }
    public void hienThiThongTin(){

    }

}
