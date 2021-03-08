package _12_thuat_toan_tim_kiem.baitap;

public class BinarySearchOptional {
    int binarySearch(int arr[], int left, int right, int number) {
        if (right >= left) {
            int mid = (right + left) / 2;

            if (arr[mid] == number) {
                return mid;
            }
            if (arr[mid] > number) {
                return binarySearch(arr, left, mid - 1, number);
            }
            return binarySearch(arr, mid + 1, right, number);
        } else {
            return -1;
        }
    }

    public static void main(String args[]) {
        BinarySearchOptional binarySearchOptional = new BinarySearchOptional();
        int arr[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int right = arr.length-1;
        int left=0;
        int number = 11;
        int result = binarySearchOptional.binarySearch(arr, left, right, number);
        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}

