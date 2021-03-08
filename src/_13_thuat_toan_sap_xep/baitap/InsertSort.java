package _13_thuat_toan_sap_xep.baitap;

public class InsertSort {
    public static void sort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int key = list[i];
            int j = i - 1;
            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = key;
        }
    }

    static void disPlay(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "  ");
        }
    }

    public static void main(String[] args) {
        int[] list = {3, 1, 4, 2, 11, 6, 12, 10, 78, 7, 8, 9, 13, 15, 14};
        InsertSort.sort(list);
        disPlay(list);
    }
}
