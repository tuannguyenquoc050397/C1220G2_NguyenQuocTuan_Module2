package review_oop.baitap_oop_2.tuyen_sinh;

import java.util.*;

public class ThiSinh {
    private String soBaoDanh;
    private String tenThiSinh;
    private String diaChi;
    private String uuTien;


    public ThiSinh(String soBaoDanh, String tenThiSinh, String diaChi, String uuTien) {
        this.soBaoDanh = soBaoDanh;
        this.tenThiSinh = tenThiSinh;
        this.diaChi = diaChi;
        this.uuTien = uuTien;
        QuanLyThiSinh.listThiSinh.add(this);
        QuanLyThiSinh.listSoBaoDanh.add(this.soBaoDanh);
    }
    public String getSoBaoDanh() {
        return soBaoDanh;
    }

    public void setSoBaoDanh(String soBaoDanh) {
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

    public String getUuTien() {
        return uuTien;
    }

    public void setUuTien(String uuTien) {
        this.uuTien = uuTien;
    }

    @Override
    public String toString() {
        return "ThiSinh{" +
                "soBaoDanh=" + soBaoDanh +
                ", tenThiSinh='" + tenThiSinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", uuTien=" + uuTien +
                '}';
    }




}
