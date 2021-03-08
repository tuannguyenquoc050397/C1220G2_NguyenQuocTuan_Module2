package review_oop.baitap_oop_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Account {
    private String idCard;
    private String nameCard;
    private double money;
    private final double rateMoney = 0.035;
    public static List<Account> listAccount = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public Account(String idCard, String nameCard) {
        this.idCard = idCard;
        this.nameCard = nameCard;
        this.money = 50;
        listAccount.add(this);
    }

    public Account() {
        listAccount.add(this);
    }

    public Account(String idCard, String nameCard, double money) {
        this.idCard = idCard;
        this.nameCard = nameCard;
        this.money = money;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
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
                check = true;
            } else if (moneyOut > this.money) {
                System.out.println("so tien rut > so tien trong tai khoan" +
                        "\n tai khoan cua ban co: " + this.money +
                        "\n hay nhap lai so tien muon rut");
                check = true;
            } else {
                System.out.println("ban rut tien thanh cong");
                check = false;
            }
        } while (check);
        return this.money -= moneyOut;
    }

    public double maturity() {
        return this.money += this.money * rateMoney;
    }

    public double transferMoney() {
        listAccount.remove(this);
        boolean flag = true;
        System.out.println("hay nhap so tai khoan (id) ");
        String temp;
        int index = -1;
        do {
            temp= scanner.nextLine();
            for (int i = 0; i < listAccount.size(); i++) {
                if (temp.equals(listAccount.get(i).getIdCard())) {
                    flag = false;
                    index=i;
                    break;
                }
            }
            if (index==-1)
            System.out.println("so tai khoan ko ton tai");
            else
                System.out.println("ban da nhap dung");
        } while (flag);
        System.out.println("nhap so tien muon chuyen");
        boolean check=true;
        while (check)
        try{
            String money=scanner.nextLine();
            validate(Integer.parseInt(money),this);
            listAccount.get(index).setMoney(listAccount.get(index).getMoney()+Integer.parseInt(money));
            check=false;
        }catch (ExeptionCheckMoney m){
            System.out.println(m);
        }catch (Exception e){
            System.out.println("loi nhap");
        }finally {
            listAccount.add(this);
        }
        return this.getMoney();
    }
    static void validate(double money, Account account) throws ExeptionCheckMoney {
        if (money <= 0) {
            throw new ExeptionCheckMoney("hay nhap so tien duong");
        }
        else if(account.getMoney()<money) {
            throw new ExeptionCheckMoney("so tien trong the cua ban ko du" +
                    "-----------------" +
                    "\n so tien trong the hien tai: " + account.getMoney());
        }else {
            account.setMoney(account.getMoney()-money);
            System.out.println("chuyen tien thanh cong" +
                    "\n so tien trong the hien tai: "+account.getMoney());
        }

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
        Account myAccount = new Account("11397", "name");
        Account account1 = new Account("1", "name1");
        Account account2 = new Account("2", "name2");
        Account account3 = new Account("3", "name3");
        Account account4 = new Account("4", "name4");
        myAccount.transferMoney();
//        System.out.println(listAccount.size());
    }
}
