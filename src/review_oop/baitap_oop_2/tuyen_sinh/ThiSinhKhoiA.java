package review_oop.baitap_oop_2.tuyen_sinh;

public class ThiSinhKhoiA extends ThiSinh {
    private String monThi="Toan, Ly, Hoa";

    public ThiSinhKhoiA(long soBaoDanh, String tenThiSinh, String diaChi, double uuTien) {
        super(soBaoDanh, tenThiSinh, diaChi, uuTien);
    }

    public String getMonThi() {
        return monThi;
    }

    public void setMonThi(String monThi) {
        this.monThi = monThi;
    }
}
