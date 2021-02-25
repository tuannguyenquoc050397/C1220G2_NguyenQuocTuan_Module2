package _09_dsa_danhSach.baitap;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger=new MyList<Integer>(3);
        System.out.println("-----add ko index-----");
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.disPlay();
        listInteger.add(2,5);
        listInteger.add(2,5);
        listInteger.add(2,5);
        System.out.println("");
        System.out.println("-----add co index-----");
        listInteger.disPlay();
    }
}
