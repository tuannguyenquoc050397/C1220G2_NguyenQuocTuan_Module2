package review_oop.baitap_oop_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleManager {
    private String nameVehicle;
    private double cylinderCapacity;
    private double pricesOfVehicle;
    public static List<VehicleManager> listVehicle = new ArrayList<>();

    public VehicleManager() {
    }

    public VehicleManager(String nameVehicle, double cylinderCapacity, double pricesOfVehicle) {
        this.nameVehicle = nameVehicle;
        this.cylinderCapacity = cylinderCapacity;
        this.pricesOfVehicle = pricesOfVehicle;
    }

    public String getNameVehicle() {
        return nameVehicle;
    }

    public void setNameVehicle(String nameVehicle) {
        this.nameVehicle = nameVehicle;
    }

    public double getCylinderCapacity() {
        return cylinderCapacity;
    }

    public void setCylinderCapacity(double cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }

    public double getPricesOfVehicle() {
        return pricesOfVehicle;
    }

    public void setPricesOfVehicle(double pricesOfVehicle) {
        this.pricesOfVehicle = pricesOfVehicle;
    }

    public double registrationFee() {
        if (this.cylinderCapacity < 100) {
            return this.pricesOfVehicle / 100;
        } else if (this.cylinderCapacity > 100 && this.cylinderCapacity < 200) {
            return this.pricesOfVehicle * 3 / 100;
        } else
            return this.pricesOfVehicle * 5 / 100;
    }

    public void addNew() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap thong tin cua xe" +
                "\n-------------" +
                "\nten xe ");
        String nameVehicle = scanner.nextLine();
        System.out.println("dung tich xy lanh (don vi: cc) ");
        double cylinderCapacity = scanner.nextDouble();
        System.out.println("gia tri cua xe(don vi: $) ");
        double pricesOfVehicle = scanner.nextDouble();
        listVehicle.add(new VehicleManager(nameVehicle, cylinderCapacity, pricesOfVehicle));
        System.out.println("nhap thanh cong!");
    }
    public void showList(){
        for (VehicleManager vehicleManager:listVehicle){
            System.out.println("ten: "+vehicleManager.getNameVehicle()+"---xy lanh: "+vehicleManager.getCylinderCapacity()+
            "---gia xe: "+vehicleManager.getPricesOfVehicle()+"--- thue: "+vehicleManager.registrationFee());
        }
    }
    public void disPlay() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Nhap thong tin xe" +
                "\n2. Xuat tien thue cua xe" +
                "\n3. Thoat");
        byte choice = scanner.nextByte();
        switch (choice) {
            case 1:
                addNew();
                System.out.println("an 1 de quay lai menu" +
                                "\nan 2 de thoat");
                byte choiceCase1 = scanner.nextByte();
                switch (choiceCase1) {
                    case 1:
                        disPlay();
                        break;
                    case 2:
                        break;
                    default:
                }
                break;
            case 2:
                showList();
                System.out.println("an 1 de quay lai menu" +
                        "\nan 2 de thoat");
                byte choiceCase2 = scanner.nextByte();
                switch (choiceCase2) {
                    case 1:
                        disPlay();
                        break;
                    case 2:
                        break;
                    default:
                }
                break;
            case 3:
                break;
            default:
        }

    }

    public static void main(String[] args) {
        VehicleManager vehicleManager=new VehicleManager();
        vehicleManager.disPlay();
    }
}
