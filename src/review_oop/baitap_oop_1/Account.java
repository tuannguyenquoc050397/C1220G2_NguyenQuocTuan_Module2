package review_oop.baitap_oop_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Account {
    private long idCard;
    private String nameCard;
    private double money;
    private final double rateMoney = 0.035;
    public static List<Account> listAccount=new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public Account(long idCard, String nameCard) {
        this.idCard = idCard;
        this.nameCard = nameCard;
        this.money = 50;
    }

    public Account() {
    }

    public Account(long idCard, String nameCard, double money) {
        this.idCard = idCard;
        this.nameCard = nameCard;
        this.money = money;
    }

    public long getIdCard() {
        return idCard;
    }

    public void setIdCard(long idCard) {
        this.idCard = idCard;
    }

    public String getNameCard() {
        return nameCard;
    }

    public void setNameCard(String nameCard) {
        this.nameCard = nameCard;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double payInCard() {
        double moneyIn;
        System.out.println("hay nhap so tien nap vao tk");
        do {
            moneyIn = scanner.nextDouble();
            if (moneyIn < 0) {
                System.out.println("so tien phai >0" +
                        "\nhay nhap lai");
            } else {
                System.out.println("ban nap tien thanh cong");
            }
        } while (moneyIn < 0);
        return this.money += moneyIn;
    }

    public double payOutCard() {
        double moneyOut;
        boolean check = false;
        System.out.println("hay nhap so tien rut ra");

        do {
            moneyOut = scanner.nextDouble();
            if (moneyOut < 0) {
                System.out.println("so tien phai >0" +
                        "\nhay nhap lai");
                check=true;
            } else if (moneyOut > this.money) {
                System.out.println("so tien rut > so tien trong tai khoan" +
                        "\n tai khoan cua ban co: " + this.money +
                        "\n hay nhap lai so tien muon rut");
                check=true;
            } else {
                System.out.println("ban rut tien thanh cong");
                check =false;
            }
        } while (check);
        return this.money -= moneyOut;
    }

    public double maturity() {
        return this.money += this.money * rateMoney;
    }

    public double transferMoney(Account otherAccount) {

//        do{
//            System.out.println("nhap so tai khoan");
//        }
        return 0;
    }

    @Override
    public String toString() {
        return "Account{" +
                "idCard=" + idCard +
                ", nameCard='" + nameCard + '\'' +
                ", money=" + money +
                ", rateMoney=" + rateMoney +
                '}';
    }

    public static void main(String[] args) {
        Account account=new Account(01,"name");
        account.payInCard();
        System.out.println(account);
        account.payOutCard();
        System.out.println(account);

    }
}
