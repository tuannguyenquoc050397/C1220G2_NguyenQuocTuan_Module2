package _12_thuat_toan_tim_kiem.baitap;

public class BinarySearchOptional {
    int binarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == x) {
                return mid;
            }
            if (arr[mid] > x) {
                return binarySearch(arr, l, mid - 1, x);
            }
            return binarySearch(arr, mid + 1, r, x);
        } else {
            return -1;
        }
    }

    public static void main(String args[]) {
        BinarySearchOptional ob = new BinarySearchOptional();
        int arr[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int n = arr.length-1;
        int x = 11;
        int result = ob.binarySearch(arr, 0, n, x);
        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}

