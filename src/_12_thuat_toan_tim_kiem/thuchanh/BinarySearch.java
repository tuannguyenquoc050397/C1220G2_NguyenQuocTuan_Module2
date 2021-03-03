package _12_thuat_toan_tim_kiem.thuchanh;

public class BinarySearch {
    static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

    static int binarySearch(int[] list, int key) {
        int high = list.length - 1;
        int low = 0;
        while (high >= low) {
            int mid = (high + low) / 2;
            if (list[mid] == key) {
                return mid;
            } else if (list[mid] > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(BinarySearch.binarySearch(list,1));
        System.out.println(BinarySearch.binarySearch(list,60));
        System.out.println(BinarySearch.binarySearch(list,7));
    }
}
