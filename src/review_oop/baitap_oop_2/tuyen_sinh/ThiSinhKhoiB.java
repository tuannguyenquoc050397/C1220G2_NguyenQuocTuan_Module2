package review_oop.baitap_oop_2.tuyen_sinh;

public class ThiSinhKhoiB extends ThiSinh {
    private String monThi="Toan, Ly, Sinh";

    public ThiSinhKhoiB(String soBaoDanh, String tenThiSinh, String diaChi, String uuTien) {
        super(soBaoDanh, tenThiSinh, diaChi, uuTien);
    }

    public String getMonThi() {
        return monThi;
    }

    public void setMonThi(String monThi) {
        this.monThi = monThi;
    }

    @Override
    public String toString() {
        return super.toString()+"---ThiSinhKhoiB{" +
                "monThi='" + monThi + '\'' +
                '}';
    }
}
